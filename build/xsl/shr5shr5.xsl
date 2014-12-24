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
	<xsl:variable name="skills"
		select="document(concat($path,'/skills.xml'),/)" />

	<xsl:variable name="cyberwares"
		select="document(concat($path,'/cyberware.xml'),/)" />
	<xsl:variable name="biowares"
		select="document(concat($path,'/bioware.xml'),/)" />
	<xsl:variable name="powers"
		select="document(concat($path,'/powers.xml'),/)" />

	<xsl:include href="shr5-functions.xsl" />
	<xsl:template
		match="categories|version|accessories|grades|enhancements|enhancement" />

	<xsl:template match="/">
		<shr5:ShrList xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
			xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" name="all">
			<entries xsi:type="shr5:ShrList" name="cyberware">
				<xsl:for-each select="$cyberwares">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
			</entries>
			<!-- <entries xsi:type="shr5:ShrList" name="bioware"> -->
			<!-- <xsl:for-each select="$biowares"> -->
			<!-- <xsl:apply-templates select="node()" /> -->
			<!-- </xsl:for-each> -->
			<!-- </entries> -->
			<!-- <entries xsi:type="shr5:ShrList" name="power"> -->
			<!-- <xsl:for-each select="$powers"> -->
			<!-- <xsl:apply-templates select="node()" /> -->
			<!-- </xsl:for-each> -->
			<!-- </entries> -->

		</shr5:ShrList>
	</xsl:template>
	<!-- -->
	<xsl:template name="iterate.kipower">
		<xsl:param name="index" select="1" />
		<xsl:param name="max" select="4" />
		<xsl:call-template name="kipower">
			<xsl:with-param name="rating" select="$index" />
		</xsl:call-template>

		<!-- the loop -->
		<xsl:if test="$index &lt; $max">
			<!-- Call myself with the next index -->
			<xsl:call-template name="iterate.kipower">
				<xsl:with-param name="index" select="$index + 1" />
				<xsl:with-param name="max" select="$max" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!-- rating based cyberware -->
	<xsl:template name="kipower">
		<xsl:param name="rating" />
		<entries xsi:type="shr5:KiKraft">
			<xsl:if test="number(points/text())">
				<xsl:attribute name="kraftpunkte">
				<xsl:value-of select="number(points/text())*-100 * $rating" />
				</xsl:attribute>
			</xsl:if>
			<xsl:attribute name="name"><xsl:value-of
				select="concat(name/text(),' ',$rating)" /></xsl:attribute>
			<xsl:call-template name="set_parentid" />
			<xsl:call-template name="simple_quelle" />
			<!-- <xsl:call-template name="gegenstand-basis-rating"> <xsl:with-param 
				name="rating" select="$rating" /> </xsl:call-template> -->
			<xsl:call-template name="mods_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>

			<xsl:call-template name="localization_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
		</entries>
	</xsl:template>
	<xsl:template match="//power">
		<xsl:choose>
			<xsl:when test="levels/text()='yes'">
				<xsl:call-template name="iterate.kipower">
					<xsl:with-param name="max">
						<xsl:choose>
							<xsl:when test="number(maxlevel/text())">
								<xsl:value-of select="number(maxlevel/text())" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of select="4" />
							</xsl:otherwise>
						</xsl:choose>
					</xsl:with-param>
				</xsl:call-template>

			</xsl:when>
		</xsl:choose>

		<entries xsi:type="shr5:KiKraft">

			<xsl:if test="number(points/text())">
				<xsl:attribute name="kraftpunkte">
				<xsl:value-of select="number(points/text())*-100" />
				</xsl:attribute>
			</xsl:if>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="mods_rating">
				<xsl:with-param name="rating" select="1" />
			</xsl:call-template>

			<xsl:call-template name="localization" />
		</entries>


	</xsl:template>

	<!-- -->
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
<!-- 	additional cyberware attributes-->
		<xsl:template name="cyberware_add">
		<xsl:choose>
			<xsl:when test="category/text()='Cyberlimb Enhancement' or category/text()='Cyberlimb Accessory'">
				<xsl:attribute name="xsi:type">shr5:CyberwareEnhancement</xsl:attribute>
				<xsl:if test="starts-with(capacity/text(),'[')">
				<xsl:attribute name="capacityUse">
				<xsl:value-of select="substring-after(substring-before(capacity/text(), ']'), '[')" />
				</xsl:attribute>
			</xsl:if>
			</xsl:when>
			<xsl:otherwise>
				<xsl:attribute name="xsi:type">shr5:Cyberware</xsl:attribute>
			</xsl:otherwise>
		</xsl:choose>
		
			<xsl:if test="number(capacity/text())">
				<xsl:attribute name="cyberwareCapacity">
				<xsl:value-of select="number(capacity/text())" />
				</xsl:attribute>
			</xsl:if>
			<xsl:choose>
			<xsl:when test="category/text()='Cyberlimb' or category/text()='Cyberlimb Enhancement' or category/text()='Cyberlimb Accessory'">
				<xsl:attribute name="type">cyberlimb</xsl:attribute>
			</xsl:when>
			<xsl:when test="category/text()='Bodyware'">
				<xsl:attribute name="type">bodyware</xsl:attribute>
			</xsl:when>
			<xsl:when test="category/text()='Headware'">
				<xsl:attribute name="type">headware</xsl:attribute>
			</xsl:when>

			</xsl:choose>
		
		</xsl:template>
	<!-- rating based cyberware -->
	<xsl:template name="cyberware">
		<xsl:param name="rating" />
		<entries xsi:type="shr5:Cyberware">
			<xsl:attribute name="name"><xsl:value-of
				select="concat(name/text(),' ',$rating)" /></xsl:attribute>
			<xsl:call-template name="cyberware_add"/>
			
			<xsl:if test="starts-with(capacity/text(),'[')">
				<xsl:attribute name="capacityUse">
				<xsl:value-of select="$rating" />
				</xsl:attribute>
			</xsl:if>

			<xsl:call-template name="gegenstand-basis-rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="mods_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="essenceMod">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="localization_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
		</entries>
	</xsl:template>
	<!-- -->
	<xsl:template match="//cyberware">
		<xsl:if
			test=" category/text()!='Cyber Implant Weapon'">
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
				<xsl:call-template name="cyberware_add"/>
				<xsl:call-template name="mods_rating">
					<xsl:with-param name="rating" select="1" />
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

	<xsl:template match="//bioware">
		<xsl:choose>
			<xsl:when test="number(rating/text())">
				<xsl:call-template name="iterate.bioware">
					<xsl:with-param name="max">
						<xsl:value-of select="number(rating/text())" />
					</xsl:with-param>
				</xsl:call-template>
			</xsl:when>
		</xsl:choose>
		<xsl:call-template name="bioware" />
	</xsl:template>

	<xsl:template name="iterate.bioware">
		<xsl:param name="index" select="1" />
		<xsl:param name="max" select="4" />
		<xsl:call-template name="bioware_rating">
			<xsl:with-param name="rating" select="$index" />
		</xsl:call-template>
		<!-- the loop -->
		<xsl:if test="$index &lt; $max">
			<!-- Call myself with the next index -->
			<xsl:call-template name="iterate.bioware">
				<xsl:with-param name="index" select="$index + 1" />
				<xsl:with-param name="max" select="$max" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<!-- -->
	<xsl:template name="bioware">
		<entries xsi:type="shr5:BioWare">
			<xsl:call-template name="gegenstand-basis" />
			<xsl:call-template name="mods_rating">
				<xsl:with-param name="rating" select="1" />
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
	</xsl:template>


	<!-- rating based cyberware -->
	<xsl:template name="bioware_rating">
		<xsl:param name="rating" />
		<entries xsi:type="shr5:BioWare">
			<xsl:attribute name="name"><xsl:value-of
				select="concat(name/text(),' ',$rating)" /></xsl:attribute>
			<xsl:call-template name="gegenstand-basis-rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="mods_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="essenceMod">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>
			<xsl:call-template name="localization_rating">
				<xsl:with-param name="rating" select="$rating" />
			</xsl:call-template>

		</entries>
	</xsl:template>
</xsl:stylesheet>