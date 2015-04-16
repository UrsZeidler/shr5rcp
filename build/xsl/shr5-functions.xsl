<xsl:stylesheet version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
	xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />
	<xsl:include href="base-shr5-functions.xsl" />
	
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


	<xsl:template name="findMartialTechnique">
		<xsl:param name="name" />
		<xsl:for-each select="$martialarts">
			<xsl:for-each select="chummer/techniques/*">
				<xsl:if test="name/text()=$name">
					<xsl:variable name="id_name" select="id/text()" />
					<xsl:value-of select="$id_name" />
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>


	<xsl:template name="generator-instructions">
		<instructions key="new" value="Select the categories and the group." />
		<instructions key="readyForCreation"
			value="All has been set, you can create the character now." />
		<instructions key="personaCreated"
			value="The character is created spend all the values." />
		<instructions key="commited"
			value="The character is finshed and commited." />
	</xsl:template>

	<xsl:template name="additional-constrains">
		<xsl:for-each select="$qualities">
			<xsl:for-each select="chummer/qualities/*">
				<xsl:call-template name="additional-constrain">
					<xsl:with-param name="id" select="id/text()" />
				</xsl:call-template>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="additional-constrain">
		<xsl:param name="id" />
		<additionalConstrains
			targets="4a4e1079-5872-4f3f-a450-48c30a5504f3 4cef53aa-13ea-4f28-8fbf-e3b254248247">
			<xsl:attribute name="source">
	<xsl:value-of select="$id" />
	</xsl:attribute>

		</additionalConstrains>

	</xsl:template>

	<xsl:template name="lifestyle-to-money">
		<xsl:for-each select="$lifestyle">
			<xsl:for-each select="chummer/lifestyles/*">
				<xsl:if test="number(dice/text())">
					<lifestyleToStartMoney>
						<xsl:attribute name="numberOfW"><xsl:value-of
							select="dice/text()" /></xsl:attribute>
						<xsl:attribute name="moneyFactor"><xsl:value-of
							select="multiplier/text()" /></xsl:attribute>
						<xsl:attribute name="lifeStyles"><xsl:value-of
							select="id/text()" /></xsl:attribute>
					</lifestyleToStartMoney>
				</xsl:if>
			</xsl:for-each>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="findSpirit">
		<xsl:param name="spiritname" />
		<xsl:for-each select="$critter-species">
			<xsl:for-each select="chummer/metatypes/*">
				<xsl:if test="name/text()=$spiritname">
					<xsl:variable name="id_name" select="id/text()" />
					<xsl:value-of select="concat($id_name,' ')" />
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

</xsl:stylesheet>