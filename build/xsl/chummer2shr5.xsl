<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" indent="yes" encoding="UTF-8" />
	<xsl:strip-space elements="*" />
	<xsl:param name="path" select="'/home/urs/chummer2/Chummer2/data'" />
	<xsl:variable name="powers"
		select="document(concat($path,'/powers.xml'),/)" />
	<xsl:variable name="armors"
		select="document(concat($path,'/armor.xml'),/)" />
	<xsl:variable name="weapons"
		select="document(concat($path,'/weapons.xml'),/)" />
	<xsl:variable name="ranges"
		select="document(concat($path,'/ranges.xml'),/)" />
	<xsl:variable name="skills"
		select="document(concat($path,'/skills.xml'),/)" />
	<xsl:variable name="gears" select="document(concat($path,'/gear.xml'),/)" />
	<xsl:variable name="metatypes"
		select="document(concat($path,'/metatypes.xml'),/)" />
	<xsl:variable name="cyberwares"
		select="document(concat($path,'/cyberware.xml'),/)" />
	<xsl:variable name="spells"
		select="document(concat($path,'/spells.xml'),/)" />
	<xsl:variable name="qualities"
		select="document(concat($path,'/qualities.xml'),/)" />
	<xsl:variable name="biowares"
		select="document(concat($path,'/bioware.xml'),/)" />
	<xsl:variable name="vehicles"
		select="document(concat($path,'/vehicles.xml'),/)" />
	<xsl:variable name="shr5CharacterBuilder"
		select="document(concat($path,'/priorities.xml'),/)" />
	<xsl:variable name="lifestyle"
		select="document(concat($path,'/lifestyles.xml'),/)" />
	<xsl:template match="/">
		<shr5:ShrList xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
			xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" name="all">
			<entries xsi:type="shr5:ShrList" name="resourcen">
				<entries xsi:type="shr5:ShrList" name="Sourcebooks">
					<entries xsi:type="shr5:SourceBook" name="Grundregelwerk"
						startShrTime="2013-12-13T17:51:44.000+0100" endShrTime="2013-12-13T17:51:44.000+0100" />
				</entries>
				<xsl:for-each select="$ranges">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$metatypes">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$skills">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$weapons">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$gears">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$cyberwares">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$powers">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$armors">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$spells">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$qualities">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$biowares">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$vehicles">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$lifestyle">
					<xsl:apply-templates mode="lifestyle" select="node()" />
				</xsl:for-each>
				<xsl:for-each select="$shr5CharacterBuilder">
					<xsl:apply-templates select="node()" />
				</xsl:for-each>

			</entries>
			<entries xsi:type="shr5:ShrList" name="Generators">
				<xsl:call-template name="examples" />
			</entries>
		</shr5:ShrList>
	</xsl:template>
	<xsl:template match="categories|version|accessories|grades|modcategories" />
	<xsl:template match="priority|mods|limits" />
	<xsl:template mode="lifestyle"
		match="safehousecosts|version|qualities|comforts|entertainments|necessities|neighborhoods|securities|costs" />
	<xsl:template match="ranges">
		<entries xsi:type="shr5:ShrList" name="Reichtweiten">
			<xsl:apply-templates />
		</entries>
	</xsl:template>
	<xsl:template mode="lifestyle" match="lifestyles">
		<entries xsi:type="shr5:ShrList" name="lifestyles">
			<xsl:apply-templates mode="lifestyle" />
		</entries>
	</xsl:template>
	<xsl:template
		match="gears|armors|skills|knowledgeskills|cyberwares|weapons|powers|skillgroups|metatypes|spells|qualities|biowares|vehicles">
		<entries xsi:type="shr5:ShrList">
			<xsl:attribute name="name"><xsl:value-of select="name()" /></xsl:attribute>
			<xsl:apply-templates />
		</entries>
	</xsl:template>
	<!-- the generator -->
	<xsl:template match="priority" mode="gen" />
	<xsl:template match="bonus" mode="gen" />
	<!-- <xsl:template match="specials" mode="gen" /> -->
	<xsl:template match="priorities">
		<entries xsi:type="shr5:ShrList" name="generators">
			<entries xsi:type="shr5mngt:Shr5System" name="The basic character generator system."
				karmaToResourceFactor="2000" karmaToMagicFactor="5" karmaPoints="25"
				charismaToConnectionFactor="3" maxKarmaToResources="10"
				maxResourceToKeep="5000" knowlegeSkillFactor="2" maxKarmaToKeep="7"
				numberOfMaxAttributes="1">
				<xsl:attribute name="srcBook">//@entries.0/@entries.0/@entries.0</xsl:attribute>
				<xsl:apply-templates mode="gen" />
				<priorities xsi:type="shr5mngt:Mudan" categorieName="E">
					<selectableTypes href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
				</priorities>
				<instructions key="new"
					value="Select the categories and the group." />
				<instructions key="readyForCreation"
					value="All has been set, you can create the character now." />
				<instructions key="personaCreated"
					value="The character is created spend all the values." />
				<instructions key="commited"
					value="The character is finshed and commited." />
				<xsl:call-template name="advancements" />
				<xsl:for-each select="$lifestyle">
					<xsl:for-each select="chummer/lifestyles/*">
						<lifestyleToStartMoney>
							<xsl:attribute name="numberOfW"><xsl:value-of
								select="dice/text()" /></xsl:attribute>
							<xsl:attribute name="moneyFactor"><xsl:value-of
								select="multiplier/text()" /></xsl:attribute>
							<xsl:variable name="pos" select="position()-1" />
							<xsl:attribute name="lifeStyles"><xsl:value-of
								select="concat('//@entries.0/@entries.15/@entries.',$pos)" /></xsl:attribute>

						</lifestyleToStartMoney>
					</xsl:for-each>
				</xsl:for-each>
			</entries>
			<entries xsi:type="shr5mngt:FreeStyle" name="Free Style Generator">
				<instructions key="new" value="Choose the basic Concept" />
				<instructions key="readyForCreation"
					value="All has been set, you can create the character now." />
				<instructions key="personaCreated"
					value="The character is created you can comit any time." />
				<instructions key="commited"
					value="The character is finshed and commited." />
				<xsl:call-template name="advancements" />
			</entries>

			<!-- <entries xsi:type="shr5mngt:Shr5Generator" generator="//@entries.16/@entries.0" 
				/> <entries xsi:type="shr5mngt:Shr5Generator" generator="//@entries.16/@entries.0" 
				/> <entries xsi:type="shr5mngt:CharacterGroup" name="player group" /> <entries 
				xsi:type="shr5mngt:CharacterGroup" name="non player group" /> -->

		</entries>
	</xsl:template>
	<xsl:template match="resource" mode="gen">
		<priorities xsi:type="shr5mngt:Resourcen">
			<xsl:attribute name="categorieName"><xsl:value-of select="priority/text()" /></xsl:attribute>
			<xsl:attribute name="resource"><xsl:value-of select="nuyen/text()" /></xsl:attribute>
		</priorities>
	</xsl:template>
	<xsl:template match="skill" mode="gen">
		<priorities xsi:type="shr5mngt:Skill">
			<xsl:attribute name="categorieName"><xsl:value-of select="priority/text()" /></xsl:attribute>
			<xsl:attribute name="skillPoints">
			<xsl:value-of select="substring-before(points/text(),'/')" />
			</xsl:attribute>
			<xsl:attribute name="groupPoints">
			<xsl:value-of select="substring-after(points/text(),'/')" />
			</xsl:attribute>
		</priorities>
	</xsl:template>
	<xsl:template match="attribute" mode="gen">
		<priorities xsi:type="shr5mngt:Attributes">
			<xsl:attribute name="categorieName"><xsl:value-of select="priority/text()" /></xsl:attribute>
			<xsl:attribute name="attibutePoints"><xsl:value-of select="points/text()" /></xsl:attribute>
		</priorities>
	</xsl:template>
	<xsl:template match="priorities/metatypes/metatype/metatypes/metatype"
		mode="gen">
		<priorities xsi:type="shr5mngt:MetaType">
			<xsl:attribute name="categorieName"><xsl:value-of
				select="../../priority/text()" /></xsl:attribute>
			<xsl:attribute name="specialPoints"><xsl:value-of select="points/text()" /></xsl:attribute>
			<xsl:variable name="posid" select="id/text()" />
			<choosableTypes>
				<xsl:for-each select="$metatypes">
					<xsl:for-each select="chummer/metatypes/*">
						<xsl:if test="id/text()=$posid">
							<xsl:variable name="pos" select="position()-1" />
							<xsl:attribute name="href"><xsl:value-of
								select="concat('#//@entries.2/@entries.',$pos)" /></xsl:attribute>
						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
			</choosableTypes>
		</priorities>
	</xsl:template>
	<xsl:template
		match="priorities/specials/special/magician|priorities/specials/special/mysticadept"
		mode="gen">
		<xsl:variable name="typename" select="name()" />
		<priorities xsi:type="shr5mngt:Spellcaster">
			<xsl:attribute name="categorieName"><xsl:value-of select="../priority/text()" /></xsl:attribute>
			<xsl:attribute name="magic"><xsl:value-of select="mag/text()" /></xsl:attribute>
			<xsl:attribute name="spellPoints"><xsl:value-of select="spells/text()" /></xsl:attribute>
			<xsl:call-template name="skill-options" />
			<xsl:if test="$typename='magician'">
				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.7/@fertigkeiten.0 //@entries.0/@entries.3/@entries.4/@fertigkeiten.1 //@entries.0/@entries.3/@entries.4/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.0</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//Magier" />
			</xsl:if>
			<xsl:if test="$typename='mysticadept'">
				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.7/@fertigkeiten.0 //@entries.0/@entries.3/@entries.4/@fertigkeiten.1 //@entries.0/@entries.3/@entries.4/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.0</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//MysticAdept" />
			</xsl:if>
		</priorities>
	</xsl:template>
	<xsl:template
		match="priorities/specials/special/adept|priorities/specials/special/aspected"
		mode="gen">
		<xsl:variable name="typename" select="name()" />
		<priorities xsi:type="shr5mngt:Adept">
			<xsl:attribute name="categorieName"><xsl:value-of select="../priority/text()" /></xsl:attribute>
			<xsl:attribute name="magic"><xsl:value-of select="mag/text()" /></xsl:attribute>
			<xsl:call-template name="skill-options" />
			<xsl:if test="$typename='adept'">
				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.1/@fertigkeiten.0 //@entries.0/@entries.3/@entries.1/@fertigkeiten.1 //@entries.0/@entries.4/@entries.7 //@entries.0/@entries.3/@entries.13/@fertigkeiten.2 //@entries.0/@entries.3/@entries.1/@fertigkeiten.2 //@entries.0/@entries.3/@entries.11/@fertigkeiten.0 //@entries.0/@entries.4/@entries.5 //@entries.0/@entries.4/@entries.8</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//KiAdept" />
			</xsl:if>
			<xsl:if test="$typename='aspected'">
				<xsl:attribute name="selectableSkillGroups">//@entries.0/@entries.3/@entries.4 //@entries.0/@entries.3/@entries.7 //@entries.0/@entries.3/@entries.12</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//AspektMagier" />
			</xsl:if>
		</priorities>
	</xsl:template>
	<xsl:template match="priorities/specials/special/technomancer"
		mode="gen">
		<priorities xsi:type="shr5mngt:Technomancer"
			selectableSkills="//@entries.0/@entries.3/@entries.14/@fertigkeiten.0 //@entries.0/@entries.3/@entries.14/@fertigkeiten.2 //@entries.0/@entries.3/@entries.14/@fertigkeiten.1"
			selectableSkillGroups="//@entries.0/@entries.3/@entries.14">
			<xsl:attribute name="categorieName"><xsl:value-of select="../priority/text()" /></xsl:attribute>
			<xsl:attribute name="complexForms"><xsl:value-of select="forms/text()" /></xsl:attribute>
			<xsl:attribute name="resonanz"><xsl:value-of select="res/text()" /></xsl:attribute>
			<xsl:call-template name="skill-options" />
			<selectableTypes href="http://urszeidler.de/shr5/1.0#//Technomancer" />
		</priorities>
	</xsl:template>
	<!-- vehicle -->
	<xsl:template name="examples">
	  <entries xsi:type="shr5mngt:CharacterGroup" name="player group">
      <members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@entries.5" choosenLifestyle="//@entries.1/@entries.0/@members.0/@contracts.0" nativeLanguage="//@entries.0/@entries.5/@entries.8" sex="male">
        <persona xsi:type="shr5:KiAdept" image="/shr5Resource/images/gunter-face-small.png" name="Gu" edgeBasis="5" konstitutionBasis="5" geschicklichkeitBasis="6" reaktionBasis="5" staerkeBasis="4" charismaBasis="3" willenskraftBasis="3" intuitionBasis="4" logikBasis="2" spezies="//@entries.0/@entries.2/@entries.0" magieBasis="6">
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.1" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" stufe="6"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.27"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" stufe="6"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.1/@fertigkeiten.0" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.13/@fertigkeiten.2" stufe="6"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.8" stufe="4"/>
          <fertigkeitsGruppen gruppe="//@entries.0/@entries.3/@entries.0"/>
          <fertigkeitsGruppen gruppe="//@entries.0/@entries.3/@entries.10" stufe="2"/>
          <eigenschaften name="Ambidextrous" page="71" srcBook="//@entries.0/@entries.0/@entries.0" karmaKosten="4"/>
          <eigenschaften name="Quick Healer" page="77" srcBook="//@entries.0/@entries.0/@entries.0" karmaKosten="3"/>
          <eigenschaften name="Allergy (Uncommon, Moderate)" page="78" srcBook="//@entries.0/@entries.0/@entries.0" karmaKosten="-10"/>
          <eigenschaften name="Toughness" page="77" srcBook="//@entries.0/@entries.0/@entries.0" karmaKosten="9"/>
          <kikraft name="Improved Reflexes 3" kraftpunkte="-350">
            <mods wert="3">
              <attribut href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/initativWuerfel"/>
            </mods>
            <mods>
              <attribut href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion"/>
            </mods>
          </kikraft>
          <kikraft name="Combat Sense" kraftpunkte="-50"/>
          <kikraft name="Mystic Armor" kraftpunkte="-50">
            <mods>
              <attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer"/>
            </mods>
          </kikraft>
          <kikraft name="Improved Physical Attribute" kraftpunkte="-100">
            <mods wert="1">
              <attribut href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/geschicklichkeit"/>
            </mods>
          </kikraft>
          <kikraft name="Improved Sense" kraftpunkte="-25"/>
          <kikraft name="Enhanced Accuracy" kraftpunkte="-25"/>
        </persona>
        <inventar xsi:type="shr5:Feuerwaffe" page="426" srcBook="//@entries.0/@entries.0/@entries.0" wert="725" verfuegbarkeit="5R" name="Ares Predator V" schadenscode="8P" praezision="5" durchschlagsKraft="-1" reichweite="//@entries.0/@entries.1/@entries.3">
          <modie>HM</modie>
          <erweiterung>Lauf</erweiterung>
          <erweiterung>Oben</erweiterung>
          <einbau name="Smartgun System, Internal" page="433" srcBook="//@entries.0/@entries.0/@entries.0"/>
        </inventar>
        <inventar xsi:type="shr5:Nahkampfwaffe" page="422" srcBook="//@entries.0/@entries.0/@entries.0" wert="1000" verfuegbarkeit="9R" name="Katana" schadenscode="(STR+3)P" praezision="7" durchschlagsKraft="-3"/>
        <inventar xsi:type="shr5:Nahkampfwaffe" page="422" srcBook="//@entries.0/@entries.0/@entries.0" wert="300" verfuegbarkeit="4" name="Combat Knife" schadenscode="(STR+2)P" praezision="6" durchschlagsKraft="-3"/>
        <inventar xsi:type="shr5:Feuerwaffe" page="429" srcBook="//@entries.0/@entries.0/@entries.0" wert="2100" verfuegbarkeit="4R" name="Remington 950" schadenscode="12P" praezision="7" durchschlagsKraft="-4" reichweite="//@entries.0/@entries.1/@entries.9">
          <modie>EM</modie>
          <erweiterung>Lauf</erweiterung>
          <erweiterung>Oben</erweiterung>
          <einbau name="Imaging Scope" page="432" srcBook="//@entries.0/@entries.0/@entries.0"/>
        </inventar>
        <inventar xsi:type="shr5:Gegenstand" page="448" srcBook="//@entries.0/@entries.0/@entries.0" wert="250" verfuegbarkeit="2" name="Miniwelder" kategorie="B&amp;E Gear"/>
        <contracts xsi:type="shr5:Lifestyle" name="Low" page="95" srcBook="//@entries.0/@entries.0/@entries.0" wert="2000" verfuegbarkeit=""/>
      </members>
    </entries>
    <entries xsi:type="shr5mngt:CharacterGroup" name="non player group">
      <members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@entries.2">
        <persona xsi:type="shr5:Technomancer" name="James" edgeBasis="3" konstitutionBasis="3" geschicklichkeitBasis="2" reaktionBasis="2" staerkeBasis="3" charismaBasis="3" willenskraftBasis="3" intuitionBasis="4" logikBasis="4" spezies="//@entries.0/@entries.2/@entries.0">
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.6/@fertigkeiten.0" stufe="3"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.5/@fertigkeiten.1" stufe="1"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.5/@fertigkeiten.2" stufe="5"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.14/@fertigkeiten.0" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.14/@fertigkeiten.2" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.8" stufe="2"/>
          <eigenschaften name="Natural Hardening" page="76" srcBook="//@entries.0/@entries.0/@entries.0" karmaKosten="10"/>
        </persona>
      </members>
      <members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@entries.3" nativeLanguage="//@entries.0/@entries.5/@entries.6" sex="male">
        <persona xsi:type="shr5:MudanPersona" name="Rob" edgeBasis="1" konstitutionBasis="9" geschicklichkeitBasis="4" reaktionBasis="3" staerkeBasis="11" charismaBasis="3" willenskraftBasis="4" intuitionBasis="3" logikBasis="3" spezies="//@entries.0/@entries.2/@entries.4">
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.27" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" stufe="5"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" stufe="5"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.6/@fertigkeiten.0" stufe="1"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.4" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.3" stufe="1"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.8" stufe="1"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.2/@fertigkeiten.1" stufe="2"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.1" stufe="3"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.1"/>
          <fertigkeitsGruppen gruppe="//@entries.0/@entries.3/@entries.1" stufe="2"/>
          <koerperMods xsi:type="shr5:Cyberware" name="Bone Lacing, Plastic" page="454" srcBook="//@entries.0/@entries.0/@entries.0" wert="8000" verfuegbarkeit="8R">
            <mods wert="1">
              <attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer"/>
            </mods>
            <mods wert="-50">
              <attribut href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz"/>
            </mods>
          </koerperMods>
          <koerperMods xsi:type="shr5:Cyberware" name="Reaction Enhancers" page="455" srcBook="//@entries.0/@entries.0/@entries.0" verfuegbarkeit="(Rating*5)R">
            <mods wert="2">
              <attribut href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion"/>
            </mods>
            <mods wert="-300">
              <attribut href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz"/>
            </mods>
          </koerperMods>
        </persona>
        <inventar xsi:type="shr5:Feuerwaffe" page="428" srcBook="//@entries.0/@entries.0/@entries.0" wert="1500" verfuegbarkeit="8R" name="FN HAR" schadenscode="10P" praezision="5" durchschlagsKraft="-2" reichweite="//@entries.0/@entries.1/@entries.6">
          <modie>HM</modie>
          <modie>SM</modie>
          <modie>AM</modie>
          <erweiterung>Lauf</erweiterung>
          <erweiterung>Oben</erweiterung>
          <erweiterung>Unten</erweiterung>
          <einbau name="Laser Sight" page="432" srcBook="//@entries.0/@entries.0/@entries.0"/>
          <einbau name="Gas-Vent 2 System" page="431" srcBook="//@entries.0/@entries.0/@entries.0"/>
        </inventar>
        <inventar xsi:type="shr5:Feuerwaffe" page="427" srcBook="//@entries.0/@entries.0/@entries.0" wert="660" verfuegbarkeit="5R" name="Colt Cobra TZ-120" schadenscode="7P" praezision="4" reichweite="//@entries.0/@entries.1/@entries.5">
          <modie>HM</modie>
          <modie>SM</modie>
          <modie>AM</modie>
          <erweiterung>Lauf</erweiterung>
          <erweiterung>Oben</erweiterung>
          <erweiterung>Unten</erweiterung>
          <einbau name="Laser Sight" page="432" srcBook="//@entries.0/@entries.0/@entries.0"/>
          <einbau name="Gas-Vent 2 System" page="431" srcBook="//@entries.0/@entries.0/@entries.0"/>
        </inventar>
        <inventar xsi:type="shr5:Feuerwaffe" page="426" srcBook="//@entries.0/@entries.0/@entries.0" wert="725" verfuegbarkeit="5R" name="Ares Predator V" schadenscode="8P" praezision="5" durchschlagsKraft="-1" reichweite="//@entries.0/@entries.1/@entries.3">
          <modie>HM</modie>
          <erweiterung>Lauf</erweiterung>
          <erweiterung>Oben</erweiterung>
          <einbau name="Smartgun System, Internal" page="433" srcBook="//@entries.0/@entries.0/@entries.0"/>
        </inventar>
        <inventar xsi:type="shr5:Nahkampfwaffe" page="422" srcBook="//@entries.0/@entries.0/@entries.0" wert="1000" verfuegbarkeit="9R" name="Katana" schadenscode="(STR+3)P" praezision="7" durchschlagsKraft="-3"/>
        <contracts xsi:type="shr5:Sin" name="Sin Stufe 4" wert="10000" stufe="4" gefaelscht="true"/>
      </members>
      <members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@entries.4">
        <persona xsi:type="shr5:MysticAdept" name="Kyra" edgeBasis="1" konstitutionBasis="3" geschicklichkeitBasis="6" reaktionBasis="3" staerkeBasis="2" charismaBasis="6" willenskraftBasis="4" intuitionBasis="4" logikBasis="3" spezies="//@entries.0/@entries.2/@entries.1" magieBasis="6">
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.0" stufe="5"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.2" stufe="5"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" stufe="3"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" stufe="3"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.2" stufe="4"/>
          <fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.8" stufe="3"/>
          <fertigkeitsGruppen gruppe="//@entries.0/@entries.3/@entries.4" stufe="2"/>
          <zauber stufe="1" formel="//@entries.0/@entries.11/@entries.2"/>
        </persona>
      </members>
    </entries>
    <entries xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@entries.1/@members.0" generator="//@entries.0/@entries.16/@entries.0" state="personaCreated" selectedGroup="//@entries.1/@entries.1" characterName="Example James" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.42" skills="//@entries.0/@entries.16/@entries.0/@priorities.41" attribute="//@entries.0/@entries.16/@entries.0/@priorities.19" metaType="//@entries.0/@entries.16/@entries.0/@priorities.14" magic="//@entries.0/@entries.16/@entries.0/@priorities.27"/>
    <entries xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@entries.1/@members.1" generator="//@entries.0/@entries.16/@entries.0" selectedGroup="//@entries.1/@entries.1" characterName="Rob" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.45" skills="//@entries.0/@entries.16/@entries.0/@priorities.39" attribute="//@entries.0/@entries.16/@entries.0/@priorities.17" metaType="//@entries.0/@entries.16/@entries.0/@priorities.9" magic="//@entries.0/@entries.16/@entries.0/@priorities.47" karmaToResource="10"/>
    <entries xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@entries.1/@members.2" generator="//@entries.0/@entries.16/@entries.0" state="personaCreated" selectedGroup="//@entries.1/@entries.1" characterName="Kyra" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.46" skills="//@entries.0/@entries.16/@entries.0/@priorities.39" attribute="//@entries.0/@entries.16/@entries.0/@priorities.18" metaType="//@entries.0/@entries.16/@entries.0/@priorities.15" magic="//@entries.0/@entries.16/@entries.0/@priorities.23"/>
    <entries xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@entries.0/@members.0" generator="//@entries.0/@entries.16/@entries.0" selectedGroup="//@entries.1/@entries.0" characterName="Gu" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.46" skills="//@entries.0/@entries.16/@entries.0/@priorities.39" attribute="//@entries.0/@entries.16/@entries.0/@priorities.17" metaType="//@entries.0/@entries.16/@entries.0/@priorities.14" magic="//@entries.0/@entries.16/@entries.0/@priorities.28" karmaToResource="13"/>
    <entries xsi:type="shr5mngt:Shr5Generator" generator="//@entries.0/@entries.16/@entries.0"/>
    <entries xsi:type="shr5mngt:FreeStyleGenerator" generator="//@entries.0/@entries.16/@entries.1" characterName="Free Style Generator"/>
	
	
	
	</xsl:template>
	<xsl:template name="advancements">
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://urszeidler.de/shr5/1.0#//FertigkeitsGruppe" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="2">
			<type href="http://urszeidler.de/shr5/1.0#//Fertigkeit" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="1">
			<type href="http://urszeidler.de/shr5/1.0#//Wissensfertigkeit" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="1">
			<type href="http://urszeidler.de/shr5/1.0#//Sprachfertigkeit" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://urszeidler.de/shr5/1.0#//Zauber" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://urszeidler.de/shr5/1.0#//PersonaKomplexForm" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://www.eclipse.org/emf/2002/Ecore#//EAttribute" />
		</characterAdvancements>

	</xsl:template>
	<xsl:template name="vehicle">
		<xsl:param name="typeName" />
		<entries>
			<xsl:attribute name="xsi:type"><xsl:value-of
				select="concat('shr5:',$typeName)" /></xsl:attribute>

			<xsl:attribute name="fahrzeugTyp"><xsl:value-of select="category/text()" /></xsl:attribute>
			<xsl:call-template name="gegenstand-basis" />
		</entries>
	</xsl:template>
	<!-- basic named templates -->
	<xsl:template name="beschreibbar">
		<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
		<xsl:if test="string-length(doc/text())!=0">
			<xsl:attribute name="beschreibung"><xsl:value-of select="doc/text()" /></xsl:attribute>
		</xsl:if>
	</xsl:template>
	<xsl:template name="quelle">
		<xsl:if test="number(page/text())">
			<xsl:attribute name="page"><xsl:value-of select="number(page/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:attribute name="srcBook">//@entries.0/@entries.0/@entries.0</xsl:attribute>
	</xsl:template>
	<xsl:template name="gegenstand-basis">
		<xsl:call-template name="beschreibbar" />
		<xsl:call-template name="quelle" />
		<xsl:if test="number(cost/text())">
			<xsl:attribute name="wert"><xsl:value-of select="number(cost/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:attribute name="verfuegbarkeit"><xsl:value-of select="avail/text()" /></xsl:attribute>
	</xsl:template>
	<xsl:template name="skill-options">
		<xsl:if test="number(skills/qty/text())">
			<xsl:attribute name="skillNumber"><xsl:value-of select="skills/qty/text()" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(skills/rating/text())">
			<xsl:attribute name="skillValue"><xsl:value-of
				select="skills/rating/text()" /></xsl:attribute>
		</xsl:if>
	</xsl:template>


	<xsl:template name="waffe">
		<xsl:attribute name="schadenscode"><xsl:value-of select="damage/text()" /></xsl:attribute>
		<xsl:if test="number(accuracy/text())">
			<xsl:attribute name="praezision"><xsl:value-of select="accuracy/text()" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(ap/text())">
			<xsl:attribute name="durchschlagsKraft"><xsl:value-of select="number(ap/text())" /></xsl:attribute>
		</xsl:if>
	</xsl:template>
	<xsl:template name="fw-mode">
		<xsl:param name="list" />
		<xsl:variable name="first" select="substring-before($list, '/')" />
		<xsl:variable name="remaining" select="substring-after($list, '/')" />
		<xsl:choose>
			<xsl:when test="$first='FA'">
				<modie>AM</modie>
			</xsl:when>
			<xsl:when test="$first='BF'">
				<modie>SM</modie>
			</xsl:when>
			<xsl:when test="$first='SA'">
				<modie>HM</modie>
			</xsl:when>
			<xsl:when test="$first='SS'">
				<modie>EM</modie>
			</xsl:when>
		</xsl:choose>
		<xsl:if test="$remaining">
			<xsl:call-template name="fw-mode">
				<xsl:with-param name="list" select="$remaining" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>
	<xsl:template name="mods">
		<xsl:for-each select="bonus/*">
			<xsl:choose>
				<xsl:when test="name()='initiativedice'">
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
	<xsl:template name="skill">
		<xsl:attribute name="ausweichen">
			<xsl:choose>
			<xsl:when test="default/text()='No'">
				<xsl:value-of select="'false'" />
			</xsl:when>
			<xsl:otherwise>
			<xsl:value-of select="'true'" />
			</xsl:otherwise>
			
			</xsl:choose>
	</xsl:attribute>
		<!-- <attribut> -->
		<xsl:attribute name="attribut">
			<xsl:call-template name="MATCH">
         <xsl:with-param name="matchingName" select="attribute/text()" />
      </xsl:call-template>
		</xsl:attribute>
		<!-- </attribut> -->
		<xsl:call-template name="beschreibbar" />
		<xsl:call-template name="quelle" />
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
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/logik'" />
			</xsl:when>
			<xsl:when test="$matchingName='RES'">
				<xsl:value-of
					select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/logik'" />
			</xsl:when>
		</xsl:choose>
	</xsl:template>
	<!-- lifestyle -->
	<xsl:template match="//lifestyle" mode="lifestyle">
		<entries xsi:type="shr5:Lifestyle">
			<xsl:call-template name="gegenstand-basis" />
		</entries>
	</xsl:template>
	<!-- metatype -->
	<xsl:template match="//metatype">
		<entries xsi:type="shr5:Spezies">
			<xsl:if test="number(bodmin/text())">
				<xsl:attribute name="konstitutionMin"><xsl:value-of
					select="number(bodmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(bodmax/text())">
				<xsl:attribute name="konstitutionMax"><xsl:value-of
					select="number(bodmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(agimin/text())">
				<xsl:attribute name="geschicklichkeitMin"><xsl:value-of
					select="number(agimin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(agimax/text())">
				<xsl:attribute name="geschicklichkeitMax"><xsl:value-of
					select="number(agimax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(reamax/text())">
				<xsl:attribute name="reaktionMax"><xsl:value-of
					select="number(reamax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(reamin/text())">
				<xsl:attribute name="reaktionMin"><xsl:value-of
					select="number(reamin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(strmax/text())">
				<xsl:attribute name="staerkeMax"><xsl:value-of
					select="number(strmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(strmin/text())">
				<xsl:attribute name="staerkeMin"><xsl:value-of
					select="number(strmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(chamax/text())">
				<xsl:attribute name="charismaMax"><xsl:value-of
					select="number(chamax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(chamin/text())">
				<xsl:attribute name="charismaMin"><xsl:value-of
					select="number(chamin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(wilmax/text())">
				<xsl:attribute name="willenskraftMax"><xsl:value-of
					select="number(wilmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(wilmin/text())">
				<xsl:attribute name="willenskraftMin"><xsl:value-of
					select="number(wilmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(intmax/text())">
				<xsl:attribute name="intuitionMax"><xsl:value-of
					select="number(intmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(intmin/text())">
				<xsl:attribute name="intuitionMin"><xsl:value-of
					select="number(intmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(logmax/text())">
				<xsl:attribute name="logikMax"><xsl:value-of
					select="number(logmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(logmin/text())">
				<xsl:attribute name="logikMin"><xsl:value-of
					select="number(logmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(edgmax/text())">
				<xsl:attribute name="edgeMax"><xsl:value-of
					select="number(edgmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(edgmin/text())">
				<xsl:attribute name="edgeMin"><xsl:value-of
					select="number(edgmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(resmax/text())">
				<xsl:attribute name="resonanzMax"><xsl:value-of
					select="number(resmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(resmin/text())">
				<xsl:attribute name="resonanzMin"><xsl:value-of
					select="number(resmin/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(essmax/text())">
				<xsl:attribute name="essenzMax"><xsl:value-of
					select="number(essmax/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(essmin/text())">
				<xsl:attribute name="essenzMin"><xsl:value-of
					select="number(essmin/text())" /></xsl:attribute>
			</xsl:if>


			<xsl:if test="number(run/text())">
				<xsl:attribute name="rennen"><xsl:value-of select="number(run/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(walk/text())">
				<xsl:attribute name="laufen"><xsl:value-of
					select="number(walk/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(sprint/text())">
				<xsl:attribute name="sprinten"><xsl:value-of
					select="number(sprint/text())" /></xsl:attribute>
			</xsl:if>

			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="mods" />
		</entries>
	</xsl:template>
	<!-- zauber -->
	<xsl:template match="//spell">
		<entries xsi:type="shr5:Zauber">
			<xsl:attribute name="merkmale"><xsl:value-of select="descriptor/text()" /></xsl:attribute>
			<xsl:attribute name="kategorie"><xsl:value-of select="category/text()" /></xsl:attribute>
			<xsl:attribute name="schaden"><xsl:value-of select="damage/text()" /></xsl:attribute>
			<xsl:attribute name="entzug"><xsl:value-of select="dv/text()" /></xsl:attribute>
			<xsl:choose>
				<xsl:when test="range/text()='LOS'">
					<xsl:attribute name="reichweite">Blickfeld</xsl:attribute>
				</xsl:when>
				<xsl:when test="range/text()='T'">
					<xsl:attribute name="reichweite">Beruehrung</xsl:attribute>
				</xsl:when>
				<xsl:when test="range/text()='T'">
					<xsl:attribute name="reichweite">Beruehrung</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:choose>
				<xsl:when test="type/text()='M'">
					<xsl:attribute name="art">Mana</xsl:attribute>
				</xsl:when>
				<xsl:when test="type/text()='P'">
					<xsl:attribute name="art">Physisch</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:choose>
				<xsl:when test="duration/text()='I'">
					<xsl:attribute name="dauer">Sofort</xsl:attribute>
				</xsl:when>
				<xsl:when test="duration/text()='S'">
					<xsl:attribute name="dauer">Aufrechterhalten</xsl:attribute>
				</xsl:when>
				<xsl:when test="duration/text()='P'">
					<xsl:attribute name="dauer">Permanent</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
		</entries>

	</xsl:template>
	<!-- kikraft -->
	<xsl:template match="//power">
		<xsl:if test="string-length(skillgroup/text())=0">
			<entries xsi:type="shr5:KiKraft">
				<xsl:if test="number(points/text())">
					<xsl:attribute name="kraftpunkte">
				<xsl:value-of select="number(points/text())*-100" />
				</xsl:attribute>
				</xsl:if>
				<xsl:call-template name="beschreibbar" />
				<xsl:call-template name="mods" />

			</entries>
		</xsl:if>
	</xsl:template>
	<!-- quallity -->
	<xsl:template match="//quality">
		<entries xsi:type="shr5:PersonaEigenschaft">
			<xsl:if test="number(cost/text())">
				<xsl:attribute name="karmaKosten">
				<xsl:value-of select="number(cost/text())" />
				</xsl:attribute>
			</xsl:if>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="mods" />

		</entries>
	</xsl:template>
	<!-- skill -->
	<xsl:template match="//skill">
		<xsl:if test="string-length(skillgroup/text())=0">
			<xsl:choose>
				<xsl:when test="category/text()='Language'">
					<entries xsi:type="shr5:Sprachfertigkeit">
						<xsl:call-template name="skill" />
					</entries>
				</xsl:when>
				<xsl:when
					test="category/text()!='Language' and name(..)='knowledgeskills' ">
					<entries xsi:type="shr5:Wissensfertigkeit">
						<xsl:call-template name="skill" />
					</entries>
				</xsl:when>
				<xsl:otherwise>
					<entries xsi:type="shr5:Fertigkeit">
						<xsl:call-template name="skill" />
					</entries>
				</xsl:otherwise>
			</xsl:choose>
		</xsl:if>
	</xsl:template>
	<xsl:template match="skillgroups/name">
		<entries xsi:type="shr5:FertigkeitsGruppe">
			<xsl:attribute name="name"><xsl:value-of select="text()" /></xsl:attribute>
			<xsl:variable name="name" select="text()" />
			<xsl:for-each select="$skills">
				<xsl:for-each select="chummer/skills/*">
					<xsl:if test="skillgroup/text()=$name">
						<fertigkeiten xsi:type="shr5:Fertigkeit">
							<xsl:call-template name="skill" />
						</fertigkeiten>
					</xsl:if>
				</xsl:for-each>
			</xsl:for-each>
		</entries>
	</xsl:template>
	<!-- the ranges -->
	<xsl:template match="//range">
		<entries xsi:type="shr5:Reichweite">
			<xsl:attribute name="name"><xsl:value-of select="category/text()" /></xsl:attribute>
			<xsl:if test="number(min/text())">
				<xsl:attribute name="min"><xsl:value-of select="min/text()" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(short/text())">
				<xsl:attribute name="kurz"><xsl:value-of select="short/text()" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(medium/text())">
				<xsl:attribute name="mittel"><xsl:value-of select="medium/text()" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(long/text())">
				<xsl:attribute name="weit"><xsl:value-of select="long/text()" /></xsl:attribute>
			</xsl:if>
			<xsl:if test="number(extreme/text())">
				<xsl:attribute name="extrem"><xsl:value-of select="extreme/text()" /></xsl:attribute>
			</xsl:if>
		</entries>
	</xsl:template>
	<xsl:template match="//cyberware">
		<entries xsi:type="shr5:Cyberware">
			<xsl:call-template name="gegenstand-basis" />
			<xsl:call-template name="mods" />
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
		</entries>
	</xsl:template>
	<xsl:template match="//bioware">
		<entries xsi:type="shr5:BioWare">
			<xsl:call-template name="gegenstand-basis" />
			<xsl:call-template name="mods" />
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
		</entries>
	</xsl:template>
	<xsl:template match="//gear">
		<entries xsi:type="shr5:Gegenstand">
			<xsl:attribute name="kategorie"><xsl:value-of select="category/text()" /></xsl:attribute>
			<xsl:call-template name="gegenstand-basis" />
		</entries>
	</xsl:template>
	<xsl:template match="//vehicle">
		<xsl:choose>
			<xsl:when
				test="category/text()='Bike' or category/text()='Car' or category/text()='Truck'">
				<xsl:call-template name="vehicle">
					<xsl:with-param name="typeName" select="'Bodenfahrzeug'" />
				</xsl:call-template>
			</xsl:when>

			<xsl:otherwise>
				<xsl:call-template name="vehicle">
					<xsl:with-param name="typeName" select="'PassagierFahrzeug'" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="armor">
		<xsl:choose>
			<xsl:when test="category/text()='Armor'">
				<entries xsi:type="shr5:Kleidung">
					<xsl:call-template name="gegenstand-basis" />
					<xsl:if test="number(armorvalue/text())">
						<xsl:attribute name="ruestung"><xsl:value-of
							select="number(armorvalue/text())" /></xsl:attribute>
					</xsl:if>
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Helmets and Shields'">
				<entries xsi:type="shr5:Gegenstand">
					<xsl:call-template name="gegenstand-basis" />
					<mods>
						<xsl:if test="number(armorvalue/text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(armorvalue/text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//Panzerung/panzer'" />
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>

				</entries>
			</xsl:when>

		</xsl:choose>
	</xsl:template>

	<!-- weapon -->
	<xsl:template match="weapon">
		<xsl:if test="type/text()='Melee'">
			<entries xsi:type="shr5:Nahkampfwaffe">
				<xsl:call-template name="gegenstand-basis" />
				<xsl:call-template name="waffe" />
				<!-- <xsl:variable name="sname" select="useskill/text()" /> <xsl:for-each 
					select="$skills"> <xsl:for-each select="chummer/skills/*"> <xsl:if test="name/text()=$sname"> 
					<xsl:variable name="pos" select="position()-1" /> <xsl:attribute name="fertigkeit"><xsl:value-of 
					select="concat('//@entries.3/@entries.',$pos)" /></xsl:attribute> </xsl:if> 
					</xsl:for-each> </xsl:for-each> -->
			</entries>
		</xsl:if>
		<xsl:if test="type/text()='Ranged' and category/text()!='Gear'">
			<entries xsi:type="shr5:Feuerwaffe">
				<xsl:call-template name="gegenstand-basis" />
				<xsl:call-template name="waffe" />
				<xsl:if test="number(rc/text())">
					<xsl:attribute name="rueckstoss"><xsl:value-of
						select="number(rc/text())" /></xsl:attribute>
				</xsl:if>
				<xsl:variable name="rname" select="category/text()" />
				<xsl:for-each select="$ranges">
					<xsl:for-each select="chummer/ranges/*">
						<xsl:if test="category/text()=$rname">
							<xsl:variable name="pos" select="position()-1" />
							<xsl:attribute name="reichweite"><xsl:value-of
								select="concat('//@entries.0/@entries.1/@entries.',$pos)" /></xsl:attribute>
						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
				<xsl:call-template name="fw-mode">
					<xsl:with-param name="list"
						select="concat(normalize-space(mode/text()), '/')" />
				</xsl:call-template>
				<xsl:for-each select="accessorymounts/*">
					<xsl:choose>
						<xsl:when test="text()='Barrel'">
							<erweiterung>Lauf</erweiterung>
						</xsl:when>
						<xsl:when test="text()='Top'">
							<erweiterung>Oben</erweiterung>
						</xsl:when>
						<xsl:when test="text()='Under'">
							<erweiterung>Unten</erweiterung>
						</xsl:when>
					</xsl:choose>
				</xsl:for-each>
				<xsl:for-each select="accessories/*">
					<xsl:variable name="aid" select="text()" />
					<xsl:for-each select="$weapons">
						<xsl:for-each select="chummer/accessories/*">
							<xsl:if test="id/text()=$aid">
								<einbau>
									<xsl:call-template name="beschreibbar" />
									<xsl:call-template name="quelle" />
								</einbau>
							</xsl:if>
						</xsl:for-each>
					</xsl:for-each>
				</xsl:for-each>
			</entries>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>