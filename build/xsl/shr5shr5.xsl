<xsl:stylesheet version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
	xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />
	<xsl:strip-space elements="*" />
	<xsl:param name="path" select="'/home/urs/chummer2/Chummer2/data'" />
	<xsl:param name="loc_path"
		select="'/home/urs/eclipse_workspaces/workspace_E4.3_shr_git/chummer-data/lang/de_data.xml'" />
	<xsl:param name="do_localization" select="true" />
	<xsl:variable name="loc_data" select="document($loc_path,/)" />

	<xsl:variable name="books"
		select="document(concat($path,'/books.xml'),/)" />

	<xsl:variable name="cyberwares"
		select="document(concat($path,'/cyberware.xml'),/)" />

	<xsl:include href="shr5-functions.xsl" />

	<xsl:template match="/">
		<shr5:ShrList xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
			xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" name="all">
			<xsl:for-each select="$cyberwares">
				<xsl:apply-templates select="node()" />
			</xsl:for-each>


		</shr5:ShrList>
	</xsl:template>


	<xsl:template name="iterate.cyberware">
		<xsl:param name="index" select="1" />
		<xsl:param name="max" select="4" />
		<xsl:call-template name="cyberware">
			<xsl:with-param name="rating" select="$index" />
		</xsl:call-template>

		<!-- the loop -->
		<xsl:if test="$index &lt; $max">
			<!-- Call myself with the next index -->
			<xsl:call-template name="iterate.cyberware">
				<xsl:with-param name="index" select="$index + 1" />
				<xsl:with-param name="max" select="$max" />
			</xsl:call-template>
		</xsl:if>

	</xsl:template>
	<!-- rating based cyberware -->
	<xsl:template name="cyberware">
		<xsl:param name="rating" />
		<entries xsi:type="shr5:Cyberware">
			<xsl:attribute name="name"><xsl:value-of
				select="concat(name/text(),' ',$rating)" /></xsl:attribute>
			<xsl:call-template name="gegenstand-basis-rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="mods" >
			<xsl:with-param name="rating" select="$rating"/>
			</xsl:call-template>
			<mods>

				<!-- <xsl:if test="number(ess/text())"> -->
				<!-- <xsl:attribute name="wert"> -->
				<!-- <xsl:value-of select="number(ess/text())*-100" /> -->
				<!-- </xsl:attribute> -->
				<!-- </xsl:if> -->

				<xsl:variable name="essFactor">
					<xsl:call-template name="extractFactor">
						<xsl:with-param name="expression" select="ess/text()"></xsl:with-param>
					</xsl:call-template>
				</xsl:variable>
				<xsl:attribute name="wert">
				<xsl:choose>
					<xsl:when test="number(ess/text())">
						<xsl:value-of select="number(ess/text())*-100" />
					</xsl:when>
					<xsl:when test="number($essFactor)">
						<xsl:value-of select="round($essFactor * $rating * -100)" />
					</xsl:when>
					<xsl:otherwise>

					</xsl:otherwise>
				</xsl:choose>
				</xsl:attribute>
				<!-- <attribut> -->
				<xsl:attribute name="attribut">
							<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz'" />
					</xsl:attribute>
				<!-- </attribut> -->
			</mods>
			<xsl:call-template name="localization" />
		</entries>

	</xsl:template>
	<!-- <xsl:template name="extractFactor"> <xsl:param name="expression" /> 
		<xsl:choose> <xsl:when test="starts-with($expression,'Rating' )"> <xsl:value-of 
		select="substring-after($expression, '*') " /> </xsl:when> </xsl:choose> 
		</xsl:template> -->
	<!-- -->
	<xsl:template match="//cyberware">
		<xsl:if
			test="category/text()!='Cyberlimb Enhancement' and category/text()!='Cyberlimb Accessory' and category/text()!='Cyber Implant Weapon'">
			<xsl:choose>
				<xsl:when test="number(rating/text())">
					<xsl:call-template name="iterate.cyberware">
						<xsl:with-param name="max">
							<xsl:value-of select="number(rating/text())" />
						</xsl:with-param>
					</xsl:call-template>

				</xsl:when>
			</xsl:choose>

			<entries xsi:type="shr5:Cyberware">
				<xsl:call-template name="gegenstand-basis" />
				<xsl:call-template name="mods" >
				<xsl:with-param name="rating" select="1"/>
				</xsl:call-template>
				<mods>
					<xsl:if test="number(ess/text())">
						<xsl:attribute name="wert">
				<xsl:value-of select="number(ess/text())*-100" />
				</xsl:attribute>
					</xsl:if>
					<!-- <attribut> -->
					<xsl:attribute name="attribut">
							<xsl:value-of
						select="'http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz'" />
					</xsl:attribute>
					<!-- </attribut> -->
				</mods>
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
	</xsl:template>




</xsl:stylesheet>