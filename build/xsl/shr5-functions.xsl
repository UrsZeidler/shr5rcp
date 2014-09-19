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

	<xsl:template name="quelle">
		<xsl:call-template name="set_id" />
		<xsl:call-template name="simple_quelle" />
	</xsl:template>

	<xsl:template name="simple_quelle">
		<xsl:if test="number(page/text())">
			<xsl:attribute name="page">
				<xsl:value-of select="number(page/text())" />
			</xsl:attribute>
		</xsl:if>
		<xsl:variable name="sid1" select="source/text()" />
		<xsl:variable name="srcBookId">
			<xsl:call-template name="findSourceBook">
				<xsl:with-param name="aid" select="$sid1" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:attribute name="srcBook">
			<xsl:value-of select="$srcBookId" />
			</xsl:attribute>
	</xsl:template>

	<xsl:template name="localization_rating">
		<xsl:param name="rating" />
		<xsl:variable name="aid1" select="id/text()" />
		<xsl:variable name="loc_name">
			<xsl:call-template name="findLocalizedName">
				<xsl:with-param name="aid" select="$aid1" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:choose>
			<xsl:when test="not ($loc_name='')">
				<localizations local="de">
					<xsl:attribute name="name"><xsl:value-of
						select="concat($loc_name,' ',$rating)" /></xsl:attribute>
					<xsl:variable name="loc_page">
						<xsl:call-template name="findLocalizedPage">
							<xsl:with-param name="aid" select="$aid1" />
						</xsl:call-template>
					</xsl:variable>
					<xsl:choose>
						<xsl:when test="$loc_page=''">
							<xsl:if test="number(page/text())= page/text()">
								<xsl:attribute name="page"><xsl:value-of
									select="number(page/text())" /></xsl:attribute>
							</xsl:if>
						</xsl:when>
					</xsl:choose>
				</localizations>
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="localization">
		<xsl:variable name="aid1" select="id/text()" />
		<xsl:variable name="loc_name">
			<xsl:call-template name="findLocalizedName">
				<xsl:with-param name="aid" select="$aid1" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:choose>
			<xsl:when test="not ($loc_name='')">
				<localizations local="de">
					<xsl:attribute name="name"><xsl:value-of
						select="$loc_name" /></xsl:attribute>
					<xsl:variable name="loc_page">
						<xsl:call-template name="findLocalizedPage">
							<xsl:with-param name="aid" select="$aid1" />
						</xsl:call-template>
					</xsl:variable>
					<xsl:choose>
						<xsl:when test="$loc_page=''">
							<xsl:if test="number(page/text())= page/text()">
								<xsl:attribute name="page"><xsl:value-of
									select="number(page/text())" /></xsl:attribute>
							</xsl:if>
						</xsl:when>
					</xsl:choose>
				</localizations>
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="findSkill">
		<xsl:param name="skillname" />
		<xsl:for-each select="$skills">
			<xsl:for-each select="chummer/skills/*">
				<xsl:if test="name/text()=$skillname">
					<xsl:variable name="id_name" select="id/text()" />
					<xsl:value-of select="$id_name" />
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<!-- find the source book -->
	<xsl:template name="findSourceBook">
		<xsl:param name="aid" />
		<xsl:for-each select="$books">
			<xsl:for-each select="chummer/books/*">
				<xsl:if test="code/text()=$aid">
					<xsl:variable name="id_name" select="id/text()" />
					<xsl:value-of select="$id_name" />
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>
	<!-- find the locaized name -->
	<xsl:template name="findLocalizedName">
		<xsl:param name="aid" />
		<xsl:for-each select="$loc_data">
			<xsl:for-each select="chummer/chummer/*/*">
				<xsl:if test="id/text()=$aid">
					<xsl:variable name="loc_name" select="translate/text()" />
					<!-- <xsl:attribute name="name"><xsl:value-of select="translate/text()" 
						/></xsl:attribute> -->
					<xsl:value-of select="$loc_name" />
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="findLocalizedPage">
		<xsl:param name="aid" />
		<xsl:for-each select="$loc_data">
			<xsl:for-each select="chummer/chummer/*/*">
				<xsl:if test="id/text()=$aid">
					<xsl:if test="number(page/text())= page/text()">
						<xsl:variable name="loc_name" select="page/text()" />
						<!-- <xsl:attribute name="name"><xsl:value-of select="translate/text()" 
							/></xsl:attribute> -->
						<xsl:value-of select="$loc_name" />
					</xsl:if>
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="gegenstand-basis">
		<xsl:attribute name="verfuegbarkeit"><xsl:value-of select="avail/text()" /></xsl:attribute>
		<xsl:if test="number(cost/text())">
			<xsl:attribute name="wertValue"><xsl:value-of select="number(cost/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:call-template name="beschreibbar" />
		<xsl:call-template name="quelle" />
	</xsl:template>

	<xsl:template name="gegenstand-basis-rating">
		<xsl:param name="rating" />
		<xsl:attribute name="verfuegbarkeit"><xsl:value-of select="avail/text()" /></xsl:attribute>

		<xsl:variable name="costFactor">
			<xsl:call-template name="extractFactor">
				<xsl:with-param name="index" select="$rating" />
				<xsl:with-param name="expression" select="cost/text()"></xsl:with-param>
			</xsl:call-template>
		</xsl:variable>

		<xsl:choose>
			<xsl:when test="starts-with(cost/text(),'FixedValues' )">
				<xsl:attribute name="wertValue"><xsl:value-of select="$costFactor" />
				</xsl:attribute>


			</xsl:when>
			<xsl:otherwise>
				<xsl:attribute name="wertValue"><xsl:value-of
					select="$costFactor * $rating" />
				</xsl:attribute>
			</xsl:otherwise>
		</xsl:choose>
		<!-- <xsl:if test="number(cost/text())"> -->
		<!-- <xsl:attribute name="wertValue"><xsl:value-of select="number(cost/text())" 
			/></xsl:attribute> -->
		<!-- </xsl:if> -->
		<!-- <xsl:call-template name="beschreibbar" /> -->
		<xsl:call-template name="set_parentid" />
		<xsl:call-template name="simple_quelle" />

	</xsl:template>

	<!-- -->
	<xsl:template name="extractFactor">
		<xsl:param name="expression" />
		<xsl:param name="index" />
		<xsl:choose>
			<xsl:when test="starts-with($expression,'Rating' )">
				<xsl:value-of select="substring-after($expression, '*')  " />
			</xsl:when>
			<xsl:when test="starts-with($expression,'FixedValues' )">

				<xsl:call-template name="extractFixedValue">
					<xsl:with-param name="text"
						select="concat(substring-before(substring-after($expression, 'FixedValues('),')'),',')" />
					<xsl:with-param name="index" select="$index" />
				</xsl:call-template>
			</xsl:when>

		</xsl:choose>


	</xsl:template>

	<!-- -->
	<xsl:template name="extractFixedValue">
		<xsl:param name="text" />
		<xsl:param name="index" />
		<xsl:param name="pos" select="1" />
		<xsl:param name="separator" select="','" />
		<xsl:choose>
			<xsl:when
				test="$pos=$index or $text='' or  not(contains($text,$separator )) ">
				<xsl:value-of select="normalize-space(substring-before($text,$separator))" />
			</xsl:when>
			<xsl:otherwise>
				<!-- <xsl:value-of select="normalize-space(substring-before($text, $separator))"/> -->
				<xsl:call-template name="extractFixedValue">
					<xsl:with-param name="text"
						select="substring-after($text, $separator)" />
					<xsl:with-param name="index" select="$index" />
					<xsl:with-param name="pos" select="$pos+1" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>


	<!-- basic named templates -->
	<xsl:template name="beschreibbar">
		<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
		<xsl:if test="string-length(doc/text())!=0">
			<xsl:attribute name="beschreibung"><xsl:value-of select="doc/text()" /></xsl:attribute>
		</xsl:if>
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
	<xsl:template name="essenceMod">
		<xsl:param name="rating" />
		<mods>
			<xsl:variable name="essFactor">
				<xsl:call-template name="extractFactor">
					<xsl:with-param name="expression" select="ess/text()"></xsl:with-param>
					<xsl:with-param name="index" select="$rating" />
				</xsl:call-template>
			</xsl:variable>
			<xsl:attribute name="wert">
				<xsl:choose>
						<xsl:when test="starts-with(ess/text(),'FixedValues' )">
								<xsl:value-of select="round($essFactor *-100)" />		
						</xsl:when>
					<xsl:when test="number(ess/text())">
						<xsl:value-of select="number(ess/text())*-100" />
					</xsl:when>
					<xsl:when test="number($essFactor)">
						<xsl:value-of select="round($essFactor * $rating * -100)" />
					</xsl:when>
					
					<xsl:otherwise>
						<xsl:value-of select="0" />
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


</xsl:stylesheet>