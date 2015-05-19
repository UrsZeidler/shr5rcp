<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:uuid="java.util.UUID"
	exclude-result-prefixes="uuid shret"
	xmlns:shret="de.urszeidler.shr5.ecp.util.ShadowrunEditingTools"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />
	<xsl:strip-space elements="*" />

	<xsl:variable name="plattform-path"
		select="'platform:/resource/shr5Resource/shr5-1.shr5#'" />

	<xsl:template match="character">
		<shr5mngt:PlayerCharacter xmi:version="2.0"
			xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:shr5="http://urszeidler.de/shr5/1.0" xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0"
			chracterSource="//@generatorSrc" >
			<xsl:choose>
						<xsl:when test="sex/text()='Male'">
							<xsl:attribute name="sex"><xsl:value-of
								select="'male'" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="sex/text()='Femal'">
							<xsl:attribute name="sex"><xsl:value-of
								select="'female'" /></xsl:attribute>
						</xsl:when>
			</xsl:choose>

			<!-- <xsl:attribute name="sex"><xsl:value-of select="low sex/text()" /></xsl:attribute> -->
			<persona>
				<xsl:attribute name="xsi:type"><xsl:value-of
					select="shret:findPersonaType(adept/text(),magician/text(),technomancer/text())" /></xsl:attribute>

				<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
				<xsl:attribute name="beschreibung"><xsl:value-of select="background/text()"/></xsl:attribute>

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
						<xsl:when test="name/text()='WIL'">
							<xsl:attribute name="willenskraftBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="name/text()='EDG'">
							<xsl:attribute name="edgeBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="magician/text()='True' and name/text()='MAG'">
							<xsl:attribute name="magieBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
						<xsl:when test="technomancer/text()='True' and name/text()='RES'">
							<xsl:attribute name="resonanzBasis"><xsl:value-of
								select="value/text()" /></xsl:attribute>
						</xsl:when>
					</xsl:choose>
				</xsl:for-each>


				<xsl:for-each select="qualities/*">
					<xsl:call-template name="quallity" />
				</xsl:for-each>
				<xsl:for-each select="spells/*">
					<zauber stufe="1">
						<formel>
							<xsl:attribute name="href"><xsl:value-of
								select="concat($plattform-path, shret:findObject(name/text()))" /></xsl:attribute>
						</formel>
					</zauber>
				</xsl:for-each>
				<xsl:if test="tradition/text() != ''">
					<tradition>
						<xsl:attribute name="href">
								<xsl:value-of
							select="concat($plattform-path, shret:findTradition( tradition/text() ))" />
							</xsl:attribute>
					</tradition>
				</xsl:if>
				<xsl:for-each select="skillgroups/*">
					<xsl:call-template name="skillGroup" />
				</xsl:for-each>
				<xsl:for-each select="skills/*">
					<xsl:call-template name="skill" />
				</xsl:for-each>
				<xsl:for-each select="cyberwares/*">
					<xsl:value-of disable-output-escaping="yes"
						select="shret:copyObject(concat(name/text(),' ',rating/text()),id/text(),'koerperMods')" />
				</xsl:for-each>
				<xsl:for-each select="powers/*">
					<xsl:value-of disable-output-escaping="yes"
						select="shret:copyObject(name/text(),id/text(),'kikraft')" />
				</xsl:for-each>

				<!-- <xsl:for-each select="cyberwares/*"> -->
				<!-- <xsl:if test="improvementsource/text()='Cyberware'"> -->
				<!-- <xsl:call-template name="cyberware" /> -->
				<!-- </xsl:if> -->
				<!-- <xsl:if test="improvementsource/text()='Bioware'"> -->
				<!-- <xsl:call-template name="bioware" /> -->
				<!-- </xsl:if> -->
				<!-- </xsl:for-each> -->

				<xsl:call-template name="spec" />
			</persona>
			<xsl:for-each select="weapons/*">
				<xsl:value-of disable-output-escaping="yes"
					select="shret:copyObject(name/text(),id/text(),'inventar')" />
			</xsl:for-each>
			<xsl:for-each select="armors/*">
				<xsl:value-of disable-output-escaping="yes"
					select="shret:copyObject(name/text(),id/text(),'inventar')" />
			</xsl:for-each>
			<xsl:for-each select="gears/*">
				<xsl:value-of disable-output-escaping="yes"
					select="shret:copyObject(name/text(),id/text(),'inventar')" />
			</xsl:for-each>

			<xsl:for-each select="lifestyles/*">
				<xsl:value-of disable-output-escaping="yes"
					select="shret:copyObject(baselifestyle/text(),guid/text(),'contracts')" />
			</xsl:for-each>
			<xsl:for-each select="vehicles/*">
				<xsl:value-of disable-output-escaping="yes"
					select="shret:copyObject(name/text(),guid/text(),'vehicels')" />
			</xsl:for-each>


			<xsl:for-each select="contacts/*">
				<connections>
					<xsl:attribute name="influence"><xsl:value-of
						select="connection/text()" /></xsl:attribute>
					<xsl:attribute name="loyality"><xsl:value-of
						select="loyalty/text()" /></xsl:attribute>
				</connections>
			</xsl:for-each>
			<!-- <generatorSrc xsi:type="shr5mngt:FreeStyleGenerator" xmi:id="_B1Q4wN0CEeOvVYoRsPZlnA" 
				character="_B1PDlN0CEeOvVYoRsPZlnA" state="commited" characterName="Ralf"> 
				<generator xsi:type="shr5mngt:FreeStyle" href="platform:/resource/shr5Resource/shr5-1.shr5#_BtTPkN0CEeOvVYoRsPZlnA"/> 
				<selectedGroup href="platform:/resource/shr5Resource/shr5-1.shr5#_B1HHwd0CEeOvVYoRsPZlnA"/> 
				<selectedSpecies href="platform:/resource/shr5Resource/shr5-1.shr5#a53d885d-a4a4-443d-b6a6-b0a55b0a96c7"/> 
				<selectedType href="http://urszeidler.de/shr5/1.0#//MudanPersona"/> </generatorSrc> -->

			<generatorSrc xsi:type="shr5mngt:Shr5Generator"
				character="/" state="commited" startKarma="3">
				<xsl:attribute name="characterName"><xsl:value-of select="name/text()" /></xsl:attribute>
				<xsl:attribute name="startResources"><xsl:value-of select="nuyen/text()" /></xsl:attribute>

				<generator xsi:type="shr5mngt:Shr5System">
					<xsl:attribute name="href"><xsl:value-of
						select="concat($plattform-path, shret:findObject(gameplayoption/text()))" /></xsl:attribute>
				</generator>
				<resourcen
					href="platform:/resource/shr5Resource/shr5-1.shr5#_BtMh4d0CEeOvVYoRsPZlnA">
					<xsl:attribute name="href"><xsl:value-of
						select="concat($plattform-path, shret:findPriority(priorityresources/text(),gameplayoption/text(),'resourcen'))" /></xsl:attribute>

				</resourcen>
				<!-- <skills href="platform:/resource/shr5Resource/shr5-1.shr5#_BtGbQ90CEeOvVYoRsPZlnA" 
					/> <attribute href="platform:/resource/shr5Resource/shr5-1.shr5#_Bs4Y0N0CEeOvVYoRsPZlnA" 
					/> <metaType href="platform:/resource/shr5Resource/shr5-1.shr5#_Bs3Ksd0CEeOvVYoRsPZlnA" 
					/> <magic xsi:type="shr5mngt:Mudan" href="platform:/resource/shr5Resource/shr5-1.shr5#_BtNwAN0CEeOvVYoRsPZlnA" 
					/> -->
			</generatorSrc>

		</shr5mngt:PlayerCharacter>

	</xsl:template>


	<xsl:template name="spells">
		<zauber stufe="1">
			<formel>
				<xsl:attribute name="href"><xsl:value-of
					select="concat($plattform-path, guid/text())" /></xsl:attribute>
			</formel>
		</zauber>
	</xsl:template>

	<xsl:template name="spec">
		<spezies>
			<xsl:attribute name="href">
				<xsl:value-of
				select="concat($plattform-path, shret:findSpecies(metatype/text()))" />
				</xsl:attribute>
		</spezies>
	</xsl:template>

	<xsl:template name="skill">
		<xsl:if test="rating/text()!=0">
			<fertigkeiten>
				<xsl:attribute name="stufe">
				<xsl:value-of select="number(rating/text())" />
			</xsl:attribute>
				<fertigkeit>
					<xsl:attribute name="href"><xsl:value-of
						select="concat($plattform-path, shret:findSkill(name/text()))" /></xsl:attribute>
				</fertigkeit>
			</fertigkeiten>
		</xsl:if>
	</xsl:template>

	<xsl:template name="skillGroup">
		<xsl:if test="rating/text()!=0">
			<fertigkeitsGruppen>
				<xsl:attribute name="stufe">
				<xsl:value-of select="number(rating/text())" />
			</xsl:attribute>
				<gruppe>
					<xsl:attribute name="href"><xsl:value-of
						select="concat($plattform-path, shret:findSkillGroup(name/text()))" /></xsl:attribute>
				</gruppe>
			</fertigkeitsGruppen>
		</xsl:if>
	</xsl:template>

	<xsl:template name="quallity">
		<eigenschaften>
			<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
			<xsl:attribute name="beschreibung"><xsl:value-of select="notes/text()" /></xsl:attribute>
			<xsl:attribute name="parentId"><xsl:value-of select="guid/text()" /></xsl:attribute>
			<xsl:attribute name="page"><xsl:value-of select="page/text()" /></xsl:attribute>
			<xsl:if test="number(bp/text())">
				<xsl:attribute name="karmaKosten">
				<xsl:value-of select="number(bp/text())" />
				</xsl:attribute>
			</xsl:if>

			<srcBook>
				<xsl:attribute name="href"><xsl:value-of
					select="concat($plattform-path, shret:findSourceBook(source/text()))" /></xsl:attribute>
			</srcBook>
		</eigenschaften>
	</xsl:template>


</xsl:stylesheet>