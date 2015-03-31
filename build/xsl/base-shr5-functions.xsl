<xsl:stylesheet version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
	xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />


	<xsl:template name="set_id">
		<xsl:variable name="aid" select="id/text()" />
		<xsl:if test="$aid!=''">
			<xsl:attribute name="xmi:id"><xsl:value-of select="$aid" /></xsl:attribute>
		</xsl:if>
	</xsl:template>

	<xsl:template name="set_parentid">
		<xsl:variable name="aid" select="id/text()" />
		<xsl:if test="$aid!=''">
			<xsl:attribute name="parentId"><xsl:value-of select="$aid" /></xsl:attribute>
		</xsl:if>
	</xsl:template>
	<!-- basic named templates -->
	<xsl:template name="beschreibbar">
		<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
		<xsl:if test="string-length(doc/text())!=0">
			<xsl:attribute name="beschreibung"><xsl:value-of select="doc/text()" /></xsl:attribute>
		</xsl:if>
	</xsl:template>


	<xsl:template name="mods">
		<xsl:for-each select="qualities/positive/*">
			<xsl:choose>
				<xsl:when test="text()='Thermographic Vision'">
					<mods wert="1"
						attribut="http://urszeidler.de/shr5/1.0#//Sichtverhaeltnisse/infrarot" />
				</xsl:when>
				<xsl:when test="text()='Low-Light Vision'">
					<mods wert="1"
						attribut="http://urszeidler.de/shr5/1.0#//Sichtverhaeltnisse/restlichtverstaerkung" />
				</xsl:when>
			</xsl:choose>

		</xsl:for-each>
		<xsl:for-each select="bonus/*">
			<xsl:choose>
				<xsl:when test="name()='limitmodifier'">
					<mods>
						<xsl:if test="number(value/text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(value/text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
						<xsl:choose>
								<xsl:when test="limit/text()='Social'">
									<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//ChrakterLimits/sozial'" />
								</xsl:when>
								<xsl:when test="limit/text()='Physical'">
									<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//ChrakterLimits/koerperlich'" />
								</xsl:when>
								
							</xsl:choose>
						</xsl:attribute>
						<!-- </attribut> -->
					</mods>
				</xsl:when>
				<xsl:when test="name()='reach'">
					<mods>
						<xsl:if test="number(text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//Nahkampfwaffe/reichweite'" />
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>
				</xsl:when>
				<xsl:when test="name()='initiativedice' or name()='initiative'">
					<mods>
						<xsl:if test="number(text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//SpezielleAttribute/initativWuerfel'" />
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>
				</xsl:when>
				<xsl:when test="name()='armor' or  name()='armorvalue' ">
					<mods>
						<xsl:if test="number(text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//Panzerung/panzer'" />
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>
				</xsl:when>
				<xsl:when test="name()='specificattribute'">
					<mods>
						<xsl:if test="number(text())">
							<xsl:attribute name="wert">
						<xsl:value-of select="number(val/text())" />
					</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
			<xsl:call-template name="MATCH">
         <xsl:with-param name="matchingName" select="name/text()" />
      </xsl:call-template>
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>
				</xsl:when>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<!-- matcher for the references of the modificators -->
	<xsl:template name="MATCH">
		<xsl:param name="matchingName" />
		<xsl:choose>
			<xsl:when test="$matchingName='AGI'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/geschicklichkeit'" />
			</xsl:when>
			<xsl:when test="$matchingName='BOD'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/konstitution'" />
			</xsl:when>
			<xsl:when test="$matchingName='STR'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/staerke'" />
			</xsl:when>
			<xsl:when test="$matchingName='REA'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion'" />
			</xsl:when>
			<xsl:when test="$matchingName='INT'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition'" />
			</xsl:when>
			<xsl:when test="$matchingName='CHA'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/charisma'" />
			</xsl:when>
			<xsl:when test="$matchingName='WIL'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/willenskraft'" />
			</xsl:when>
			<xsl:when test="$matchingName='LOG'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/logik'" />
			</xsl:when>
			<xsl:when test="$matchingName='MAG'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//BaseMagischePersona/magie'" />
			</xsl:when>
			<xsl:when test="$matchingName='RES'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//ResonanzPersona/resonanz'" />
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<!-- -->
	<xsl:template name="mods_rating">
		<xsl:param name="rating" />
		<xsl:for-each select="bonus/*">
			<xsl:choose>
				<xsl:when test="name()='initiativedice' or name()='initiativepass'">
					<mods>
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//SpezielleAttribute/initativWuerfel'" />
					</xsl:attribute>
						<xsl:call-template name="setRatingWert">
							<xsl:with-param name="rating" select="$rating" />
							<xsl:with-param name="expression" select="text()" />
						</xsl:call-template>
					</mods>
				</xsl:when>
				<xsl:when test="name()='armor' or  name()='armorvalue' ">
					<mods>
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//Panzerung/panzer'" />
					</xsl:attribute>
						<!-- </attribut> -->
						<xsl:call-template name="setRatingWert">
							<xsl:with-param name="rating" select="$rating" />
							<xsl:with-param name="expression" select="text()" />
						</xsl:call-template>
					</mods>
				</xsl:when>
				<xsl:when test="name()='damageresistance'">
					<mods>
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//ProbenModifikatoren/schadenswiederstand'" />
					</xsl:attribute>
						<!-- </attribut> -->
						<xsl:call-template name="setRatingWert">
							<xsl:with-param name="rating" select="$rating" />
							<xsl:with-param name="expression" select="text()" />
						</xsl:call-template>
					</mods>
				</xsl:when>


				<xsl:when test="name()='specificattribute'">
					<mods>
						<xsl:attribute name="attribut">
							<xsl:call-template name="MATCH">
         					<xsl:with-param name="matchingName"
							select="name/text()" />
      						</xsl:call-template>
						</xsl:attribute>
						<!-- </attribut> -->
						<xsl:call-template name="setRatingWert">
							<xsl:with-param name="rating" select="$rating" />
							<xsl:with-param name="expression" select="val/text()" />
						</xsl:call-template>
					</mods>
				</xsl:when>
			</xsl:choose>
		</xsl:for-each>
	</xsl:template>

	<!-- -->
	<xsl:template name="setRatingWert">
		<xsl:param name="rating" />
		<xsl:param name="expression" />

		<xsl:attribute name="wert">
				<xsl:choose>
					<xsl:when test="number($expression)">
						<xsl:value-of select="number($expression)" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="$rating" />

					</xsl:otherwise>
				</xsl:choose>
				</xsl:attribute>
	</xsl:template>
	<!-- -->


</xsl:stylesheet>