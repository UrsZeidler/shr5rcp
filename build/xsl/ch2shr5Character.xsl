<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />
	<xsl:strip-space elements="*" />
	<xsl:param name="path" select="'/home/urs/chummer2/Chummer2/data'" />

	<xsl:variable name="skills"
		select="document(concat($path,'/skills.xml'),/)" />


	<xsl:template match="character">
		<shr5mngt:PlayerCharacter xmi:version="2.0"
			xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:shr5="http://urszeidler.de/shr5/1.0" xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0"
			chracterSource="//@generatorSrc" 
			sex="male">
<!-- 			<xsl:attribute name="sex"><xsl:value-of select="low sex/text()" /></xsl:attribute>   -->
			<persona xsi:type="shr5:MudanPersona" edgeBasis="1">
				<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
				<xsl:attribute name="beschreibung"><xsl:value-of select="background/text()" /></xsl:attribute>

				<xsl:for-each select="attributes/*">
					<xsl:choose>
						<xsl:when test="name/text()='BOD'">
							<xsl:attribute name="konstitutionBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='AGI'">
							<xsl:attribute name="geschicklichkeitBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='REA'">
							<xsl:attribute name="reaktionBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='STR'">
							<xsl:attribute name="staerkeBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='CHA'">
							<xsl:attribute name="charismaBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='INT'">
							<xsl:attribute name="intuitionBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='LOG'">
							<xsl:attribute name="logikBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
					</xsl:choose>
				</xsl:for-each>


				<xsl:for-each select="qualities/*">
					<xsl:call-template name="quallity" />
				</xsl:for-each>
				<xsl:for-each select="spells/*">
					<xsl:call-template name="spells" />
				</xsl:for-each>
				<xsl:for-each select="skills/*">
					<xsl:call-template name="skill" />
				</xsl:for-each>
				
				<xsl:call-template name="spec"/>
			</persona>
			<xsl:for-each select="contacts/*">
				<connections>
					<xsl:attribute name="influence"><xsl:value-of
						select="connection/text()" /></xsl:attribute>
					<xsl:attribute name="loyality"><xsl:value-of
						select="loyalty/text()" /></xsl:attribute>
				</connections>
			</xsl:for-each>

			<generatorSrc xsi:type="shr5mngt:Shr5Generator"
				character="/" state="commited" characterName="Ursa Major Test"
				startKarma="3" startResources="1980">

				<generator xsi:type="shr5mngt:Shr5System"
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BssLkN0CEeOvVYoRsPZlnA" />
				<selectedGroup
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BzNDQN0CEeOvVYoRsPZlnA" />
				<resourcen
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BtMh4d0CEeOvVYoRsPZlnA" />
				<skills
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BtGbQ90CEeOvVYoRsPZlnA" />
				<attribute
					href="platform:/resource/shr5Resource/shr5-1.shr5#_Bs4Y0N0CEeOvVYoRsPZlnA" />
				<metaType
					href="platform:/resource/shr5Resource/shr5-1.shr5#_Bs3Ksd0CEeOvVYoRsPZlnA" />
				<magic xsi:type="shr5mngt:Mudan"
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BtNwAN0CEeOvVYoRsPZlnA" />
			</generatorSrc>

		</shr5mngt:PlayerCharacter>

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



	<xsl:template name="persona-type">
		<xsl:choose>
			<xsl:when test="metatype/text()='Elf'">
				<xsl:value-of select="'b3259991-b315-4dbe-ae3c-51f71a1116e2'" />
			</xsl:when>
			<xsl:when test="metatype/text()='Human'">
				<xsl:value-of select="'a53d885d-a4a4-443d-b6a6-b0a55b0a96c7'" />
			</xsl:when>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="spells">
		<zauber stufe="1">
			<formel>
				<xsl:attribute name="href"><xsl:value-of
					select="concat('platform:/resource/shr5Resource/shr5-1.shr5#', guid/text())" /></xsl:attribute>
			</formel>
		</zauber>

	</xsl:template>

<xsl:template name="spec">
				<xsl:variable name="spec-id">
					<xsl:call-template
						name="persona-type" />
				</xsl:variable>
				<spezies>
				<xsl:attribute name="href">
				<xsl:value-of
					select="concat('platform:/resource/shr5Resource/shr5-1.shr5#', $spec-id)" />
				</xsl:attribute>
				</spezies>

</xsl:template>

	<xsl:template name="skill">
	<xsl:if test="rating/text()!=0">
			<xsl:variable name="fert-id">
				<xsl:call-template name="findSkill">
					<xsl:with-param name="skillname" select="name/text()" />
				</xsl:call-template>
			</xsl:variable>
		<fertigkeiten  >
      		<xsl:attribute name="stufe">
				<xsl:value-of select="number(rating/text())" />
			</xsl:attribute>
      	
      		<xsl:attribute name="href"><xsl:value-of
					select="concat('platform:/resource/shr5Resource/shr5-1.shr5#', $fert-id)" /></xsl:attribute>
    	</fertigkeiten>
	</xsl:if>	
	</xsl:template>

	<xsl:template name="quallity">
		<eigenschaften>
			<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
			<xsl:attribute name="parentId"><xsl:value-of select="guid/text()" /></xsl:attribute>
			<xsl:attribute name="page"><xsl:value-of select="page/text()" /></xsl:attribute>
			<xsl:if test="number(karma/text())">
				<xsl:attribute name="karmaKosten">
				<xsl:value-of select="number(karma/text())" />
				</xsl:attribute>
			</xsl:if>

			<srcBook
				href="platform:/resource/shr5Resource/shr5-1.shr5#_BlSjEN0CEeOvVYoRsPZlnA" />
		</eigenschaften>
	</xsl:template>

</xsl:stylesheet>