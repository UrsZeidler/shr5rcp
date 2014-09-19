<?xml version="1.0" encoding="UTF-8"?>
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
	<xsl:variable name="software"
		select="document(concat($path,'/programs.xml'),/)" />
	<xsl:variable name="shr5CharacterBuilder"
		select="document(concat($path,'/priorities.xml'),/)" />
	<xsl:variable name="lifestyle"
		select="document(concat($path,'/lifestyles.xml'),/)" />
	<xsl:variable name="critter-species"
		select="document(concat($path,'/critters.xml'),/)" />
	<xsl:variable name="critter-powers"
		select="document(concat($path,'/critterpowers.xml'),/)" />
	<xsl:variable name="complexforms"
		select="document(concat($path,'/complexforms.xml'),/)" />
	<xsl:variable name="mentors"
		select="document(concat($path,'/mentors.xml'),/)" />
	<xsl:variable name="metamagic"
		select="document(concat($path,'/metamagic.xml'),/)" />
	<xsl:variable name="books"
		select="document(concat($path,'/books.xml'),/)" />
	<xsl:include href="shr5-functions.xsl" />
	<xsl:template match="/">
		<shr5:ShrList xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
			xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" name="all">
			<entries xsi:type="shr5:ShrList" name="resourcen">
				<entries xsi:type="shr5:ShrList" name="Sourcebooks">
					<!-- <entries xsi:type="shr5:SourceBook" name="Core rule book" image="/shr5Resource/images/SR5_Cover_CRBook.jpg" 
						startShrTime="2072-12-13T17:51:44.000+0100" endShrTime="2075-12-13T17:51:44.000+0100"> 
						<localizations local="de" name="Shadowrun 5 Grundregelwerk" /> </entries> -->
					<xsl:for-each select="$books">
						<xsl:for-each select="chummer/books/*">
							<entries xsi:type="shr5:SourceBook" startShrTime="2072-12-13T17:51:44.000+0100"
								endShrTime="2075-12-13T17:51:44.000+0100">
								<xsl:call-template name="set_id" />
								<xsl:call-template name="beschreibbar" />
							</entries>
						</xsl:for-each>
					</xsl:for-each>
				</entries>
				<entries xsi:type="shr5:ShrList" name="generators">
				</entries>
				<entries xsi:type="shr5:ShrList" name="Gear">
					<xsl:for-each select="$weapons">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$gears">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$cyberwares">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$biowares">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>

					<xsl:for-each select="$armors">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$vehicles">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<entries xsi:type="shr5:ShrList" name="Credsticks">
						<entries xsi:type="shr5:Credstick" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							verfuegbarkeit="0" wertValue="5" page="443" name="Standard"
							maxValue="5000" />
						<entries xsi:type="shr5:Credstick" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							verfuegbarkeit="0" wertValue="20" page="443" name="Silver"
							maxValue="20000" />
						<entries xsi:type="shr5:Credstick" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							verfuegbarkeit="5" wertValue="20" page="443" name="Gold"
							maxValue="100000" />
						<entries xsi:type="shr5:Credstick" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							verfuegbarkeit="10" wertValue="500" page="443" name="Platinum"
							maxValue="500000" />
						<entries xsi:type="shr5:Credstick" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							verfuegbarkeit="10" wertValue="1000" page="443" name="Ebony"
							maxValue="1000000" />
					</entries>
				</entries>
				<entries xsi:type="shr5:ShrList" name="Skills">
					<xsl:for-each select="$skills">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
				</entries>
				<entries xsi:type="shr5:ShrList" name="Definitions">
					<xsl:for-each select="$ranges">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$metatypes">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$qualities">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$lifestyle">
						<xsl:apply-templates mode="lifestyle" select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$critter-species">
						<entries xsi:type="shr5:ShrList" name="Critters species">
							<xsl:apply-templates mode="critter" select="node()" />
						</entries>
					</xsl:for-each>
				</entries>
				<entries xsi:type="shr5:ShrList" name="Magic">
					<xsl:for-each select="$powers">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$spells">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$complexforms">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$mentors">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<xsl:for-each select="$metamagic">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
				</entries>
				<!-- <xsl:for-each select="$shr5CharacterBuilder"> -->
				<!-- <xsl:apply-templates select="node()" /> -->
				<!-- </xsl:for-each> -->

				<entries xsi:type="shr5:ShrList" name="additional stuff">
					<entries xsi:type="shr5:Wissensfertigkeit" name="Streetgangs Berlin">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition" />
					</entries>
					<entries xsi:type="shr5:Wissensfertigkeit" name="Sprawle life">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition" />
					</entries>
					<entries xsi:type="shr5:Wissensfertigkeit" name="Media Stars">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition" />
					</entries>
					<entries xsi:type="shr5:Wissensfertigkeit" name="Street Rumors">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition" />
					</entries>
					<entries xsi:type="shr5:Wissensfertigkeit" name="Trivia">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition" />
					</entries>
					<entries xsi:type="shr5:Cyberdeck" name="Erika MCD-1"
						deviceRating="1" attribute1="4" attribute2="3" attribute3="2"
						attribute4="1" programSlots="1" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						verfuegbarkeit="3R" wertValue="49500" page="227">
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute1" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute2" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute3" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute4" />
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
						</mods>
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/simRig" />
						</mods>
					</entries>
					<entries xsi:type="shr5:RiggerCommandConsole" name="Build from crab."
						deviceRating="1" firewallBasis="2" datenverarbeitungBasis="3"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" verfuegbarkeit="2R"
						wertValue="1400" page="265">
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
						</mods>
					</entries>
					<entries xsi:type="shr5:Cyberware" parentId="e5fef29b-8a5d-4633-a3f4-977b8ca8bfab"
						name="Control Rig 1" page="452" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						verfuegbarkeit="5E">
						<mods wert="-100">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz" />
						</mods>
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
						</mods>
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/controlRig" />
						</mods>
					</entries>
					<entries xsi:type="shr5:Cyberware" parentId="e5fef29b-8a5d-4633-a3f4-977b8ca8bfab"
						name="Control Rig 2" page="452" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						wertValue="97000" verfuegbarkeit="10R">
						<mods wert="-200">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz" />
						</mods>
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
						</mods>
						<mods wert="2">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/controlRig" />
						</mods>

					</entries>
					<entries xsi:type="shr5:Cyberdeck" name="Microdeck Summit"
						deviceRating="1" attribute1="4" attribute2="3" attribute3="3"
						attribute4="1" programSlots="1" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						verfuegbarkeit="3R" wertValue="58000" page="227">
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute1" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute2" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute3" />
						<configuration
							href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute4" />
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
						</mods>
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/simRig" />
						</mods>

					</entries>

					<xsl:for-each select="$software">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<entries xsi:type="shr5:Tutorsoft" wertValue="400" rating="1"
						name="Tutorsoft" xmi:id="e6e300e6-880d-42aa-b58b-00d656608c16"
						page="442" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					<entries xsi:type="shr5:SoftwareAgent" wertValue="1000"
						rating="1" name="Agent" xmi:id="b0bca016-ee1f-430e-b568-a670f0386c8b"
						page="442" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />

				</entries>
			</entries>
			<!-- <xsl:call-template name="examples" /> -->

		</shr5:ShrList>
	</xsl:template>
	<xsl:template match="categories|version" mode="critter" />
	<xsl:template
		match="categories|version|accessories|grades|modcategories|enhancements|enhancement" />
	<xsl:template match="priority|mods|limits|arts|art" />
	<xsl:template mode="lifestyle"
		match="safehousecosts|version|qualities|comforts|entertainments|necessities|neighborhoods|securities|costs" />
	<xsl:template mode="lifestyle" match="lifestyles">
		<entries xsi:type="shr5:ShrList" name="lifestyles">
			<xsl:apply-templates mode="lifestyle" />
			<entries xsi:type="shr5:LifestyleOption" name="Special Work Area"
				wertValue="1000" />
			<entries xsi:type="shr5:PercentLifestyleOption" name="Extra Secure"
				wertValue="20" />
			<entries xsi:type="shr5:PercentLifestyleOption" name="Obscure/Difficult to Find"
				wertValue="10" />
			<entries xsi:type="shr5:PercentLifestyleOption" name="Cramped"
				wertValue="-10" />
			<entries xsi:type="shr5:PercentLifestyleOption" name="Dangerous Area"
				wertValue="-20" />

		</entries>
	</xsl:template>
	<xsl:template
		match="ranges|gears|armors|skills|knowledgeskills|cyberwares|weapons|powers|skillgroups|metatypes|spells|qualities|biowares|vehicles|complexforms|mentors|metamagics">
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
				characterAdvancements="//@entries.0/@entries.16/@entries.2"
				charismaToConnectionFactor="3" maxKarmaToResources="10" skillMax="6"
				numberOfSpecalism="1" maxResourceToKeep="5000" knowlegeSkillFactor="2"
				maxKarmaToKeep="7" numberOfMaxAttributes="1"
				boundSprititServiceCost="1" karmaToConnectionFactor="2">
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
			<entries xsi:type="shr5mngt:FreeStyle" name="Free Style Generator"
				characterAdvancements="//@entries.0/@entries.16/@entries.2">
				<instructions key="new" value="Choose the basic Concept" />
				<instructions key="readyForCreation"
					value="All has been set, you can create the character now." />
				<instructions key="personaCreated"
					value="The character is created you can comit any time." />
				<instructions key="commited"
					value="The character is finshed and commited." />
			</entries>
			<entries xsi:type="shr5mngt:CharacterAdvancementSystem" name="The basic advancements system.">
				<xsl:call-template name="advancements" />
			</entries>
			<entries xsi:type="shr5mngt:Shr5System" name="The karma character generator system."
				karmaToResourceFactor="2500" karmaToMagicFactor="5" karmaPoints="750"
				characterAdvancements="//@entries.0/@entries.16/@entries.2"
				charismaToConnectionFactor="3" maxKarmaToResources="10" skillMax="6"
				numberOfSpecalism="1" maxResourceToKeep="5000" knowlegeSkillFactor="2"
				maxKarmaToKeep="7" numberOfMaxAttributes="1"
				karmaToConnectionFactor="2">
				<priorities xsi:type="shr5mngt:MetaType" cost="0">
					<choosableTypes href="#//@entries.0/@entries.2/@entries.0" />
				</priorities>
				<priorities xsi:type="shr5mngt:MetaType" cost="60">
					<choosableTypes href="#//@entries.0/@entries.2/@entries.1" />
				</priorities>
				<priorities xsi:type="shr5mngt:MetaType" cost="50">
					<choosableTypes href="#//@entries.0/@entries.2/@entries.2" />
				</priorities>
				<priorities xsi:type="shr5mngt:MetaType" cost="40">
					<choosableTypes href="#//@entries.0/@entries.2/@entries.3" />
				</priorities>
				<priorities xsi:type="shr5mngt:MetaType" cost="80">
					<choosableTypes href="#//@entries.0/@entries.2/@entries.4" />
				</priorities>
				<priorities xsi:type="shr5mngt:Mudan" cost="0">
					<selectableTypes href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
				</priorities>
				<priorities xsi:type="shr5mngt:Spellcaster" cost="30">
					<selectableTypes href="http://urszeidler.de/shr5/1.0#//Magier" />
				</priorities>
				<instructions key="new"
					value="Select the categories and the group." />
				<instructions key="readyForCreation"
					value="All has been set, you can create the character now." />
				<instructions key="personaCreated"
					value="The character is created spend all the values." />
				<instructions key="commited"
					value="The character is finshed and commited." />


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
								select="concat('#//@entries.0/@entries.2/@entries.',$pos)" /></xsl:attribute>
						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
			</choosableTypes>
		</priorities>
	</xsl:template>
	<xsl:template
		match="priorities/specials/special/magician|priorities/specials/special/mysticadept|priorities/specials/special/aspected"
		mode="gen">
		<xsl:variable name="typename" select="name()" />
		<priorities xsi:type="shr5mngt:Spellcaster">
			<xsl:attribute name="categorieName"><xsl:value-of select="../priority/text()" /></xsl:attribute>
			<xsl:attribute name="magic"><xsl:value-of select="mag/text()" /></xsl:attribute>
			<xsl:call-template name="skill-options" />
			<xsl:if test="$typename='magician'">
				<xsl:if test="number(spells/text())">
					<xsl:attribute name="spellPoints"><xsl:value-of
						select="spells/text()" /></xsl:attribute>
				</xsl:if>
				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.7/@fertigkeiten.0 //@entries.0/@entries.3/@entries.4/@fertigkeiten.1 //@entries.0/@entries.3/@entries.4/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.0</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//Magier" />
			</xsl:if>
			<xsl:if test="$typename='mysticadept'">
				<xsl:if test="number(spells/text())">
					<xsl:attribute name="spellPoints"><xsl:value-of
						select="spells/text()" /></xsl:attribute>
				</xsl:if>

				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.7/@fertigkeiten.0 //@entries.0/@entries.3/@entries.4/@fertigkeiten.1 //@entries.0/@entries.3/@entries.4/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.0</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//MysticAdept" />
			</xsl:if>
			<xsl:if test="$typename='aspected'">
				<xsl:attribute name="spellPoints"><xsl:value-of
					select="number(mag/text())*2" /></xsl:attribute>
				<xsl:attribute name="selectableSkills">//@entries.0/@entries.3/@entries.7/@fertigkeiten.0 //@entries.0/@entries.3/@entries.4/@fertigkeiten.1 //@entries.0/@entries.3/@entries.4/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.2 //@entries.0/@entries.3/@entries.12/@fertigkeiten.0</xsl:attribute>
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//AspektMagier" />
			</xsl:if>
		</priorities>
	</xsl:template>
	<xsl:template match="priorities/specials/special/adept"
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


		<entries xsi:type="shr5mngt:PlayerManagement" name="my player">
			<groups name="player group">


				<members xsi:type="shr5mngt:PlayerCharacter"
					chracterSource="//@entries.1/@groups.0/@members.0/@generatorSrc"
					choosenLifestyle="//@entries.1/@groups.0/@members.0/@contracts.0"
					nativeLanguage="//@entries.0/@entries.5/@entries.8" sex="male">
					<persona xsi:type="shr5:KiAdept"
						beschreibung="Gunter ist der letzte des alten Geschlechts der Kinzel, die Kinzels sind eine altes Offiziers Familie.&#xA;Der Vater Otto von Kinzel starb in den Eurokriegen, sein Mutter entschied sich sehr spät zu einer künstlichen&#xA;Befruchtung. Sie starb bei der Geburt am 26.8.2057. Gunter wuchs in einem Waisenhaus auf das durch die Stiftung&#xA;der Familie Finanziert wurde. Durch den Crash von 2064 wurde das Stifftungvermögen vernichtet und alle Datensätze&#xA;der Kinzel Stiftung. Gunter wurde wie die anderen Kinder vertrieben.&#xA;Er zog mittellos durch Niedersachsen, um in Berlin zu stranden. "
						image="/shr5Resource/images/gunter-face-small.png" name="Gunter von Kintzel"
						edgeBasis="6" konstitutionBasis="5" geschicklichkeitBasis="6"
						reaktionBasis="5" staerkeBasis="4" charismaBasis="3"
						willenskraftBasis="3" intuitionBasis="4" logikBasis="2"
						spezies="//@entries.0/@entries.2/@entries.0" magieBasis="6">
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.1" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.1/@fertigkeiten.0" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.3/@entries.13/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.21" />
						<fertigkeiten fertigkeit="//@entries.0/@entries.5/@entries.53" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.5/@entries.6" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.22" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.19/@entries.0" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.69" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.19/@entries.1" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.27" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.3/@entries.1/@fertigkeiten.1" />
						<fertigkeitsGruppen stufe="2"
							gruppe="//@entries.0/@entries.3/@entries.10" />
						<eigenschaften name="Ambidextrous" page="71"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="4" />
						<eigenschaften name="Quick Healer" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="3">
							<mods wert="2">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//ProbenModifikatoren/heilung" />
							</mods>
						</eigenschaften>
						<eigenschaften name="Allergy (Silver Moderate)"
							page="78" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							karmaKosten="-10" />
						<eigenschaften name="Toughness" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="9">
							<mods wert="1">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//ProbenModifikatoren/schadenswiederstand" />
							</mods>
						</eigenschaften>
						<kikraft name="Improved Reflexes 3" kraftpunkte="-350">
							<mods wert="3">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/initativWuerfel" />
							</mods>
							<mods wert="3">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion" />
							</mods>
						</kikraft>
						<kikraft name="Combat Sense 1" kraftpunkte="-50">
							<mods wert="1">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/ausweichen" />
							</mods>
						</kikraft>
						<kikraft name="Mystic Armor" kraftpunkte="-50">
							<mods wert="1">
								<attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer" />
							</mods>
						</kikraft>
						<kikraft name="Improved Physical Attribute agillity"
							kraftpunkte="-100">
							<mods wert="1">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/geschicklichkeit" />
							</mods>
						</kikraft>
						<kikraft name="Improved Sense" kraftpunkte="-25" />
						<kikraft name="Enhanced Accuracy" kraftpunkte="-25" />
					</persona>
					<changes xsi:type="shr5mngt:PersonaChange" changeApplied="true"
						dateApplied="2014-03-16T13:14:40.206+0100" to="1"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.7" />
					<changes xsi:type="shr5mngt:PersonaChange" changeApplied="true"
						dateApplied="2014-03-16T13:15:02.090+0100" from="1" to="2"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.7" />
					<changes xsi:type="shr5mngt:PersonaChange" changeApplied="true"
						dateApplied="2014-03-16T13:15:27.614+0100" from="2" to="3"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.3" />
					<changes xsi:type="shr5mngt:PersonaChange" changeApplied="true"
						dateApplied="2014-03-16T13:15:52.686+0100" to="1"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.14" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-03-16T21:05:35.585+0100"
						changeApplied="true" dateApplied="2014-03-16T21:06:14.346+0100"
						karma="6" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-03-20T21:05:35.585+0100"
						changeApplied="true" dateApplied="2014-03-16T21:06:43.975+0100"
						karma="6" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-03-29T21:05:35.585+0100"
						changeApplied="true" dateApplied="2014-03-16T21:08:09.119+0100"
						karma="8" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-04-01T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:08:51.017+0100"
						karma="6" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-04-05T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:10:48.765+0100"
						karma="7" />
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-04-07T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:11:33.105+0100"
						to="1" changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.15" />
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-04-08T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:12:21.577+0100"
						from="1" to="2"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.15" />
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-04-11T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:12:50.933+0100"
						karma="7" />
					<changes xsi:type="shr5mngt:AttributeChange" date="2075-04-11T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:13:23.766+0100"
						from="5" to="6">
						<attibute
							href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/edgeBasis" />
					</changes>
					<changes xsi:type="shr5mngt:KarmaGaint" date="2075-04-14T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:19:24.648+0100"
						karma="7" />
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-04-14T21:05:35.585+0200"
						changeApplied="true" dateApplied="2014-03-16T21:20:05.723+0100"
						from="1" to="2"
						changeable="//@entries.1/@groups.0/@members.0/@persona/@fertigkeiten.14" />
					<inventar xsi:type="shr5:Feuerwaffe" page="426"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="725"
						verfuegbarkeit="5R" name="Ares Predator V" schadenscode="8P"
						praezision="5" durchschlagsKraft="-1"
						reichweite="//@entries.0/@entries.1/@entries.3">
						<modie>HM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Smartgun System, Internal" page="433"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="9R" image="/shr5Resource/images/katana.png" name="Katana"
						schadenscode="(STR+3)P" praezision="7" durchschlagsKraft="-3" />
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="300"
						verfuegbarkeit="4" name="Combat Knife" schadenscode="(STR+2)P"
						praezision="6" durchschlagsKraft="-3" />
					<inventar xsi:type="shr5:Feuerwaffe" page="429"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="2100"
						verfuegbarkeit="4R" name="Remington 950" schadenscode="12P"
						praezision="7" durchschlagsKraft="-4"
						reichweite="//@entries.0/@entries.1/@entries.9">
						<modie>EM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Imaging Scope" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Kleidung" page="437"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="2" name="Armor Jacket" ruestung="12" />
					<inventar xsi:type="shr5:Gegenstand" page="438"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="200"
						verfuegbarkeit="2" name="Helmet">
						<mods wert="2">
							<attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer" />
						</mods>
					</inventar>
					<inventar xsi:type="shr5:Gegenstand" wertValue="175"
						name="quickdraw holfter" />
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="100"
						verfuegbarkeit="2" name="Meta Link" kategorie="Commlink" />
					<inventar xsi:type="shr5:Gegenstand" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="3750"
						verfuegbarkeit="0" name="Goggles" kategorie="Optical &amp; Imaging Devices">
						<mods>
							<attribut
								href="http://urszeidler.de/shr5/1.0#//FernkampfwaffenModifikatoren/smartgun" />
						</mods>
						<mods wert="2">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//FernkampfwaffenModifikatoren/vergroesserung" />
						</mods>
					</inventar>
					<contracts xsi:type="shr5:Lifestyle" name="Low" page="95"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="2000"
						verfuegbarkeit="" />
					<connections influence="3" loyality="2" />
					<connections influence="4" loyality="2" />
					<generatorSrc xsi:type="shr5mngt:Shr5Generator"
						character="//@entries.1/@groups.0/@members.0" generator="//@entries.0/@entries.16/@entries.0"
						state="commited" selectedGroup="//@entries.1/@groups.0"
						characterName="Gu" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.46"
						skills="//@entries.0/@entries.16/@entries.0/@priorities.39"
						attribute="//@entries.0/@entries.16/@entries.0/@priorities.17"
						metaType="//@entries.0/@entries.16/@entries.0/@priorities.14"
						magic="//@entries.0/@entries.16/@entries.0/@priorities.28"
						karmaToResource="3" startResources="650" />
				</members>




				<members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@generators.0"
					sex="male">
					<persona xsi:type="shr5:Technomancer" name="James"
						edgeBasis="3" konstitutionBasis="3" geschicklichkeitBasis="2"
						reaktionBasis="2" staerkeBasis="3" charismaBasis="3"
						willenskraftBasis="3" intuitionBasis="4" logikBasis="4"
						spezies="//@entries.0/@entries.2/@entries.0">
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.6/@fertigkeiten.0" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.3/@entries.5/@fertigkeiten.1" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.5/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.14/@fertigkeiten.0" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.14/@fertigkeiten.2" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<eigenschaften name="Natural Hardening" page="76"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="10" />
					</persona>
				</members>
				<members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@generators.1"
					choosenLifestyle="//@entries.1/@groups.0/@members.2/@contracts.1"
					nativeLanguage="//@entries.0/@entries.5/@entries.6" sex="male">
					<persona xsi:type="shr5:MudanPersona" name="Rob" edgeBasis="1"
						image="/shr5Resource/images/rob.png" konstitutionBasis="9"
						geschicklichkeitBasis="4" reaktionBasis="3" staerkeBasis="11"
						charismaBasis="3" willenskraftBasis="4" intuitionBasis="3"
						logikBasis="3" spezies="//@entries.0/@entries.2/@entries.4">
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.27" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.3/@entries.6/@fertigkeiten.0" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.4" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.3" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.2/@fertigkeiten.1" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.1" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.5/@entries.39" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.47" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.53" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.61" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.65" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.69" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.70" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.5/@entries.24" />
						<fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.0/@fertigkeiten.0" />
						<fertigkeitsGruppen stufe="2"
							gruppe="//@entries.0/@entries.3/@entries.1" />
						<koerperMods xsi:type="shr5:Cyberware" name="Bone Lacing, Plastic"
							page="454" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							wertValue="8000" verfuegbarkeit="8R">
							<mods wert="1">
								<attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer" />
							</mods>
							<mods wert="-50">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz" />
							</mods>
						</koerperMods>
						<koerperMods xsi:type="shr5:Cyberware" name="Reaction Enhancers 2"
							page="455" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							wertValue="26000" verfuegbarkeit="10R">
							<mods wert="2">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion" />
							</mods>
							<mods wert="-60">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//SpezielleAttribute/essenz" />
							</mods>
						</koerperMods>
						<eigenschaften name="Exceptional Attribute" page="72"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="14" />
						<eigenschaften name="SINner (National)" page="84"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-5" />
						<eigenschaften name="Quick Healer" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="3" />
						<eigenschaften name="Will to Live" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="3" />
						<eigenschaften name="Gremlins 2" page="81"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-8" />
						<eigenschaften name="Bad Rep" page="79"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-7" />
					</persona>
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-02-01T22:59:05.370+0100"
						changeApplied="true" dateApplied="2014-02-23T22:59:36.856+0100"
						from="1" to="2"
						changeable="//@entries.1/@groups.0/@members.2/@persona/@fertigkeiten.7" />
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-02-01T22:59:05.370+0100"
						changeApplied="true" dateApplied="2014-02-23T23:00:12.990+0100"
						from="1" to="2"
						changeable="//@entries.1/@groups.0/@members.2/@persona/@fertigkeiten.6" />
					<changes xsi:type="shr5mngt:PersonaChange" date="2075-02-01T22:59:05.370+0100"
						changeApplied="true" dateApplied="2014-02-23T23:14:29.584+0100"
						from="2" to="3"
						changeable="//@entries.1/@groups.0/@members.2/@persona/@fertigkeiten.9" />
					<inventar xsi:type="shr5:Feuerwaffe" page="428"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1500"
						verfuegbarkeit="8R" name="FN HAR" schadenscode="10P" praezision="5"
						durchschlagsKraft="-2" reichweite="//@entries.0/@entries.1/@entries.6">
						<modie>HM</modie>
						<modie>SM</modie>
						<modie>AM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<erweiterung>Unten</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
						<einbau name="Gas-Vent 2 System" page="431"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Feuerwaffe" page="427"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="660"
						verfuegbarkeit="5R" name="Colt Cobra TZ-120" schadenscode="7P"
						praezision="4" reichweite="//@entries.0/@entries.1/@entries.5">
						<modie>HM</modie>
						<modie>SM</modie>
						<modie>AM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<erweiterung>Unten</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
						<einbau name="Gas-Vent 2 System" page="431"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Feuerwaffe" page="426"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="725"
						verfuegbarkeit="5R" name="Ares Predator V" schadenscode="8P"
						praezision="5" durchschlagsKraft="-1"
						reichweite="//@entries.0/@entries.1/@entries.3">
						<modie>HM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Smartgun System, Internal" page="433"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="9R" name="Katana" schadenscode="(STR+3)P"
						praezision="7" durchschlagsKraft="-3" />
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="100"
						verfuegbarkeit="2R" name="Knucks" schadenscode="(STR+1)P" />
					<inventar xsi:type="shr5:Kleidung" page="437"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="2000"
						verfuegbarkeit="2" name="Armor Jacket" ruestung="12" />
					<inventar xsi:type="shr5:Gegenstand" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1400"
						verfuegbarkeit="6" name="Contacts" kategorie="Optical &amp; Imaging Devices" />
					<inventar xsi:type="shr5:Credstick" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="20"
						verfuegbarkeit="0" name="Silver" maxValue="20000" />
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="6" name="Renraku Sensei" kategorie="Commlink" />
					<inventar xsi:type="shr5:Gegenstand" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="600"
						verfuegbarkeit="2R" name="Ammo: Regular Ammo 300" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="400"
						verfuegbarkeit="9F" name="Ammo: Explosive Rounds 50" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="140"
						verfuegbarkeit="4F" name="Ammo: Hollow Points 20" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" page="435"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="300"
						verfuegbarkeit="11F" name="Minigrenade: High Explosive 3"
						kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" page="435"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="500"
						verfuegbarkeit="6R" name="Grenade: Flash-Bang 5" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						wertValue="45" name="SPare clip 9" />
					<contracts xsi:type="shr5:Sin" name="Sin Stufe 4"
						wertValue="10000" stufe="4" gefaelscht="true" />
					<contracts xsi:type="shr5:Lifestyle" name="Low 3 month Troll"
						page="95" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						wertValue="12000" verfuegbarkeit="" faelligkeitsIntervall="30" />
					<contracts xsi:type="shr5:Lizenz" name="Gun Licence"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="800"
						stufe="4" gefaelscht="true"
						lizenzTraeger="//@entries.1/@groups.0/@members.2/@contracts.0" />
					<connections influence="2" loyality="3" />
					<connections influence="2" loyality="2" />
				</members>



				<members xsi:type="shr5mngt:PlayerCharacter" chracterSource="//@entries.1/@generators.2"
					choosenLifestyle="//@entries.1/@groups.0/@members.3/@contracts.0"
					nativeLanguage="//@entries.0/@entries.5/@entries.6">
					<persona xsi:type="shr5:MysticAdept"
						image="/shr5Resource/images/kablam_Girl_s_face_in_black_frame.png"
						name="Kyra" edgeBasis="1" konstitutionBasis="3"
						geschicklichkeitBasis="6" reaktionBasis="3" staerkeBasis="2"
						charismaBasis="6" willenskraftBasis="4" intuitionBasis="4"
						logikBasis="3" spezies="//@entries.0/@entries.2/@entries.1"
						magieBasis="6">
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.0" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.0" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.2" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.0/@fertigkeiten.0" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.12" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.21" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.4/@entries.27" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.25" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.63" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.5/@entries.62" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.53" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.44" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.39" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.0" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.3/@entries.6/@fertigkeiten.0" />
						<fertigkeitsGruppen stufe="2"
							gruppe="//@entries.0/@entries.3/@entries.4" />
						<eigenschaften name="Focused Concentration (Rating 2)"
							page="74" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							karmaKosten="8" />
						<eigenschaften name="Code of Honor (Elfs)" page="79"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-15" />
						<eigenschaften name="Distinctive Style" page="80"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-5" />
						<eigenschaften name="Addiction (Mild,Bliss)" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="-4" />
						<eigenschaften name="Mentor Spirit (Sea)" page="76"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="5" />

						<kikraft name="Improved Potential" kraftpunkte="-50">
							<mods wert="1">
								<attribut
									href="http://urszeidler.de/shr5/1.0#//ChrakterLimits/sozial" />
							</mods>
						</kikraft>
						<kikraft name="Mystic Armor" kraftpunkte="-50">
							<mods wert="1">
								<attribut href="http://urszeidler.de/shr5/1.0#//Panzerung/panzer" />
							</mods>
						</kikraft>
						<kikraft name="Enhanced Accuracy" kraftpunkte="-25" />
						<kikraft name="Improved Ability" kraftpunkte="-50" />
						<kikraft name="Voice Control 1" kraftpunkte="-25" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.3" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.4" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.10" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.16" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.20" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.21" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.76" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.35" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.40" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.58" />
						<gebundeneGeister dienste="4" />
						<gebundeneGeister dienste="4" />

					</persona>

					<changes xsi:type="shr5mngt:PersonaChange" changeApplied="true"
						dateApplied="2014-03-25T12:58:04.696+0100" from="2" to="3"
						changeable="//@entries.1/@groups.0/@members.3/@persona/@fertigkeiten.17" />

					<inventar xsi:type="shr5:Feuerwaffe" page="426"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="640"
						verfuegbarkeit="4R" name="Browning Ultra-Power" schadenscode="8P"
						praezision="5" durchschlagsKraft="-1"
						reichweite="//@entries.0/@entries.1/@entries.3" munitionstyp="Streifen"
						kapazitaet="10">
						<modie>HM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Feuerwaffe" page="428"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="450"
						verfuegbarkeit="4R" name="Uzi IV" schadenscode="7P" praezision="4"
						reichweite="//@entries.0/@entries.1/@entries.5" munitionstyp="Streifen"
						kapazitaet="24">
						<modie>SM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<erweiterung>Unten</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Kleidung" page="437"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="2" name="Armor Jacket" ruestung="12" />
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="6" name="Renraku Sensei" kategorie="Commlink" />
					<inventar xsi:type="shr5:Feuerwaffe" page="427"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="350"
						verfuegbarkeit="8R" name="Steyr TMP" schadenscode="7P" praezision="4"
						reichweite="//@entries.0/@entries.1/@entries.4" munitionstyp="Streifen"
						kapazitaet="30">
						<modie>HM</modie>
						<modie>SM</modie>
						<modie>AM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Gegenstand" page="448"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="250"
						verfuegbarkeit="2"
						image="/shr5Resource/images/Aliens-Portable-Hand-Welder-1.jpg"
						name="Miniwelder" kategorie="B&amp;E Gear" />
					<inventar xsi:type="shr5:Credstick" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="20"
						verfuegbarkeit="0" name="Silver" maxValue="20000" />
					<inventar xsi:type="shr5:Gegenstand" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="400"
						verfuegbarkeit="2R" name="Ammo: Regular Ammo 200" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="175"
						verfuegbarkeit="2R" name="Ammo: Gel Rounds 70" kategorie="Ammunition" />
					<inventar xsi:type="shr5:Gegenstand" wertValue="75" name="5 x Bliss"
						kategorie="Drugs" />
					<inventar xsi:type="shr5:Gegenstand" page="447"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1500"
						verfuegbarkeit="8R" name="Autopicker 3" kategorie="B&amp;E Gear"
						stufe="3" />
					<contracts xsi:type="shr5:Lifestyle" name="Low 2 Month"
						page="95" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						wertValue="4000" verfuegbarkeit="" />
					<contracts xsi:type="shr5:Sin" name="Sin 3" wertValue="7500"
						stufe="3" gefaelscht="true" />
					<contracts xsi:type="shr5:Lizenz" name="Driver Licence"
						wertValue="800" stufe="4" gefaelscht="true" lizenGegenstand="Driver Licence"
						lizenzTraeger="//@entries.1/@groups.0/@members.3/@contracts.1" />
					<contracts xsi:type="shr5:Lizenz" name="Magic" wertValue="600"
						stufe="3" gefaelscht="true"
						lizenzTraeger="//@entries.1/@groups.0/@members.3/@contracts.1" />
					<contracts xsi:type="shr5:Lizenz" name="Fake gun license (Rating 3)"
						wertValue="600" gefaelscht="true"
						lizenzTraeger="//@entries.1/@groups.0/@members.3/@contracts.1" />
					<vehicels xsi:type="shr5:Bodenfahrzeug" name="Yamaha Growler"
						page="462" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
						wertValue="5000" verfuegbarkeit="" fahrzeugTyp="Bike" />
				</members>

				<members xsi:type="shr5mngt:PlayerCharacter"
					chracterSource="//@entries.1/@groups.0/@members.4/@generatorSrc"
					choosenLifestyle="//@entries.1/@groups.0/@members.4/@contracts.0"
					nativeLanguage="//@entries.0/@entries.5/@entries.6">
					<persona xsi:type="shr5:AspektMagier" name="Trojan"
						edgeBasis="3" konstitutionBasis="3" geschicklichkeitBasis="3"
						reaktionBasis="5" staerkeBasis="2" charismaBasis="6"
						willenskraftBasis="6" intuitionBasis="5" logikBasis="5"
						spezies="//@entries.0/@entries.2/@entries.1" magieBasis="6">
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.2" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.0" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.12/@fertigkeiten.1" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.12" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.27" />
						<fertigkeiten stufe="1"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.0" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.5/@entries.53" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.5/@entries.57" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.5/@entries.63" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.5/@entries.39" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.5/@entries.47" />
						<fertigkeitsGruppen stufe="1"
							gruppe="//@entries.0/@entries.3/@entries.1" />
						<fertigkeitsGruppen stufe="1"
							gruppe="//@entries.0/@entries.3/@entries.9" />
						<eigenschaften name="Will to Live" page="77"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="3" />
						<eigenschaften name="Bilingual" page="72"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" karmaKosten="5" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.40" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.6" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.1" />
						<zauber stufe="1" formel="//@entries.0/@entries.11/@entries.35" />
					</persona>
					<inventar xsi:type="shr5:Feuerwaffe" page="426"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="350"
						verfuegbarkeit="6R" name="Fichetti Security 600" schadenscode="7P"
						praezision="6" reichweite="//@entries.0/@entries.1/@entries.2"
						munitionstyp="Streifen" kapazitaet="30">
						<modie>HM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
						<einbau name="Laser Sight" page="432"
							srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" />
					</inventar>
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1000"
						verfuegbarkeit="6" name="Renraku Sensei" kategorie="Commlink" />
					<inventar xsi:type="shr5:Gegenstand" wertValue="8000"
						name="Spell foci" stufe="2" />
					<inventar xsi:type="shr5:Kleidung" page="437"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="900"
						verfuegbarkeit="4" name="Lined Coat" ruestung="9" />
					<inventar xsi:type="shr5:Credstick" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="20"
						verfuegbarkeit="0" name="Silver" maxValue="20000" />
					<inventar xsi:type="shr5:Gegenstand" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="1150"
						verfuegbarkeit="6" name="Contacts" kategorie="Optical &amp; Imaging Devices">
						<mods wert="1">
							<attribut
								href="http://urszeidler.de/shr5/1.0#//Sichtverhaeltnisse/infrarot" />
						</mods>
					</inventar>
					<inventar xsi:type="shr5:Munition" page="434"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="200"
						verfuegbarkeit="2R" name="Ammo: Regular Ammo" anzahl="100"
						proAnzahl="10" type="//@entries.0/@entries.1/@entries.2" />
					<inventar xsi:type="shr5:Gegenstand" page="441"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="100"
						verfuegbarkeit="2" name="Micro-Transceiver" kategorie="Communications" />
					<inventar xsi:type="shr5:Gegenstand" page="450"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" verfuegbarkeit="Rating"
						name="Medkit" kategorie="Biotech" />
					<inventar xsi:type="shr5:Gegenstand" page="443"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="500"
						verfuegbarkeit="0" name="Tool Kit" kategorie="Tools" />
					<inventar xsi:type="shr5:Gegenstand" page="441"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="5000"
						verfuegbarkeit="(Rating*3)F" name="Jammer, Area" kategorie="Communications"
						stufe="6" />
					<contracts xsi:type="shr5:Lifestyle" name="Low" page="95"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="2000"
						verfuegbarkeit="" />
					<contracts xsi:type="shr5:Sin" name="Daniel Silverbane"
						wertValue="5000" stufe="2" gefaelscht="true" />
					<contracts xsi:type="shr5:Lizenz"
						name="Adjunct professor of magical theory to carry spell foci"
						wertValue="800" gefaelscht="true"
						lizenzTraeger="//@entries.1/@groups.0/@members.4/@contracts.1" />
					<connections influence="2" loyality="2" />
					<connections influence="4" loyality="2" />
					<connections influence="4" loyality="4" />
					<generatorSrc xsi:type="shr5mngt:Shr5Generator"
						character="//@entries.1/@groups.0/@members.4" generator="//@entries.0/@entries.16/@entries.0"
						state="commited" selectedGroup="//@entries.1/@groups.0"
						characterName="Trojan" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.46"
						skills="//@entries.0/@entries.16/@entries.0/@priorities.39"
						attribute="//@entries.0/@entries.16/@entries.0/@priorities.17"
						metaType="//@entries.0/@entries.16/@entries.0/@priorities.6"
						magic="//@entries.0/@entries.16/@entries.0/@priorities.36"
						karmaToResource="10" startKarma="7" startResources="980" />
				</members>



			</groups>
			<generators xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@groups.0/@members.1"
				generator="//@entries.0/@entries.16/@entries.0" state="personaCreated"
				selectedGroup="//@entries.2/@groups.0" characterName="Example James"
				resourcen="//@entries.0/@entries.16/@entries.0/@priorities.42"
				skills="//@entries.0/@entries.16/@entries.0/@priorities.41"
				attribute="//@entries.0/@entries.16/@entries.0/@priorities.19"
				metaType="//@entries.0/@entries.16/@entries.0/@priorities.14" magic="//@entries.0/@entries.16/@entries.0/@priorities.27" />
			<generators xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@groups.0/@members.2"
				generator="//@entries.0/@entries.16/@entries.0" state="personaCreated"
				selectedGroup="//@entries.2/@groups.0" characterName="Rob"
				resourcen="//@entries.0/@entries.16/@entries.0/@priorities.45"
				skills="//@entries.0/@entries.16/@entries.0/@priorities.39"
				attribute="//@entries.0/@entries.16/@entries.0/@priorities.17"
				metaType="//@entries.0/@entries.16/@entries.0/@priorities.9" magic="//@entries.0/@entries.16/@entries.0/@priorities.47"
				karmaToResource="10" startKarma="1" startResources="2810" />
			<generators xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@groups.0/@members.3"
				generator="//@entries.0/@entries.16/@entries.0" state="personaCreated"
				selectedGroup="//@entries.2/@groups.0" characterName="Kyra"
				resourcen="//@entries.0/@entries.16/@entries.0/@priorities.46"
				skills="//@entries.0/@entries.16/@entries.0/@priorities.39"
				attribute="//@entries.0/@entries.16/@entries.0/@priorities.18"
				karmaToResource="10" metaType="//@entries.0/@entries.16/@entries.0/@priorities.15"
				magic="//@entries.0/@entries.16/@entries.0/@priorities.23" />
			<generators xsi:type="shr5mngt:Shr5Generator" generator="//@entries.0/@entries.16/@entries.0" />
			<generators xsi:type="shr5mngt:Shr5Generator" generator="//@entries.0/@entries.16/@entries.0"
				state="readyForCreation" selectedGroup="//@entries.1/@groups.0"
				characterName="Test-Aspekt-1" resourcen="//@entries.0/@entries.16/@entries.0/@priorities.43"
				skills="//@entries.0/@entries.16/@entries.0/@priorities.37"
				attribute="//@entries.0/@entries.16/@entries.0/@priorities.19"
				metaType="//@entries.0/@entries.16/@entries.0/@priorities.16" magic="//@entries.0/@entries.16/@entries.0/@priorities.36" />

			<generators xsi:type="shr5mngt:Shr5Generator" character="//@entries.1/@groups.0/@members.5"
				generator="//@entries.0/@entries.16/@entries.0" state="personaCreated"
				selectedGroup="//@entries.1/@groups.0" characterName="Test-Aspekt-1"
				resourcen="//@entries.0/@entries.16/@entries.0/@priorities.43"
				skills="//@entries.0/@entries.16/@entries.0/@priorities.37"
				attribute="//@entries.0/@entries.16/@entries.0/@priorities.19"
				metaType="//@entries.0/@entries.16/@entries.0/@priorities.16" magic="//@entries.0/@entries.16/@entries.0/@priorities.36" />
			<generators xsi:type="shr5mngt:Shr5KarmaGenerator"
				generator="//@entries.0/@entries.16/@entries.3" state="readyForCreation"
				selectedGroup="//@entries.1/@groups.0" metaType="//@entries.0/@entries.16/@entries.3/@priorities.1"
				characterConcept="//@entries.0/@entries.16/@entries.3/@priorities.6" />

		</entries>
		<entries xsi:type="shr5mngt:GamemasterManagement" name="my game stuff">


			<groups name="non player group">
				<members xsi:type="shr5mngt:NonPlayerCharacter"
					chracterSource="//@entries.2/@groups.0/@members.0/@generatorSrc"
					choosenLifestyle="//@entries.2/@groups.0/@members.0/@contracts.0"
					nativeLanguage="//@entries.0/@entries.5/@entries.6" sex="male">
					<persona xsi:type="shr5:MudanPersona"
						image="/shr5Resource/images/MrBordello_Strategy_Game_Tileset_19.png"
						name="Thugs &amp; mouth breathers" konstitutionBasis="3"
						geschicklichkeitBasis="3" reaktionBasis="3" staerkeBasis="3"
						charismaBasis="2" willenskraftBasis="3" intuitionBasis="3"
						logikBasis="2" spezies="//@entries.0/@entries.2/@entries.0">
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.1" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.4/@entries.10" />
					</persona>
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="30"
						verfuegbarkeit="0" name="Club" schadenscode="(STR+3)P" praezision="4" />
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="10"
						verfuegbarkeit="0" name="Knife" schadenscode="(STR+1)P"
						praezision="5" durchschlagsKraft="-1" />
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="100"
						verfuegbarkeit="2" name="Meta Link" kategorie="Commlink" />
					<contracts xsi:type="shr5:Lifestyle" name="Street" page="95"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" verfuegbarkeit="" />
					<generatorSrc xsi:type="shr5mngt:FreeStyleGenerator"
						character="//@entries.2/@groups.0/@members.0" generator="//@entries.0/@entries.16/@entries.1"
						state="commited" selectedGroup="//@entries.2/@groups.0"
						characterName="Thugs &amp; mouth breathers" selectedSpecies="//@entries.0/@entries.2/@entries.0">
						<selectedType href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
					</generatorSrc>
				</members>
				<members xsi:type="shr5mngt:NonPlayerCharacter"
					chracterSource="//@entries.2/@groups.0/@members.1/@generatorSrc"
					choosenLifestyle="//@entries.2/@groups.0/@members.1/@contracts.0"
					nativeLanguage="//@entries.0/@entries.5/@entries.6" sex="male">
					<persona xsi:type="shr5:MudanPersona"
						image="/shr5Resource/images/Cowboy_Shooting_Gun_Wild_West_Vector_Pixel_Art.png"
						name="Thug lieutenant" konstitutionBasis="3"
						geschicklichkeitBasis="4" reaktionBasis="3" staerkeBasis="4"
						charismaBasis="3" willenskraftBasis="3" intuitionBasis="3"
						logikBasis="3" spezies="//@entries.0/@entries.2/@entries.0">
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.0" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.1" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten fertigkeit="//@entries.0/@entries.4/@entries.9" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.4/@entries.10" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten stufe="3"
							fertigkeit="//@entries.0/@entries.5/@entries.53" />
					</persona>
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="30"
						verfuegbarkeit="0" name="Club" schadenscode="(STR+3)P" praezision="4" />
					<inventar xsi:type="shr5:Feuerwaffe" page="425"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="320"
						verfuegbarkeit="4R" name="Colt America L36" schadenscode="7P"
						praezision="7" reichweite="//@entries.0/@entries.1/@entries.2">
						<modie>HM</modie>
						<erweiterung>Lauf</erweiterung>
						<erweiterung>Oben</erweiterung>
					</inventar>
					<inventar xsi:type="shr5:Nahkampfwaffe" page="422"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="10"
						verfuegbarkeit="0" name="Knife" schadenscode="(STR+1)P"
						praezision="5" durchschlagsKraft="-1" />
					<inventar xsi:type="shr5:Gegenstand" page="439"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" wertValue="100"
						verfuegbarkeit="2" name="Meta Link" kategorie="Commlink" />
					<contracts xsi:type="shr5:Lifestyle" name="Street" page="95"
						srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66" verfuegbarkeit="" />
					<generatorSrc xsi:type="shr5mngt:FreeStyleGenerator"
						character="//@entries.2/@groups.0/@members.1" generator="//@entries.0/@entries.16/@entries.1"
						state="commited" selectedGroup="//@entries.2/@groups.0"
						characterName="Thug lieutenant" selectedSpecies="//@entries.0/@entries.2/@entries.0">
						<selectedType href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
					</generatorSrc>
				</members>
				<members xsi:type="shr5mngt:NonPlayerCharacter"
					chracterSource="//@entries.2/@groups.0/@members.2/@generatorSrc"
					sex="male">
					<persona xsi:type="shr5:MudanPersona" name="Delvil Rat"
						edgeBasis="2" konstitutionBasis="2" geschicklichkeitBasis="5"
						reaktionBasis="5" staerkeBasis="1" charismaBasis="5"
						willenskraftBasis="3" intuitionBasis="5" logikBasis="2"
						spezies="//@entries.0/@entries.17/@entries.208">
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.1/@fertigkeiten.0" />
						<fertigkeiten stufe="2"
							fertigkeit="//@entries.0/@entries.3/@entries.1/@fertigkeiten.1" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.4/@entries.8" />
						<eigenschaften name="Allergy Sun(Common, Mild)"
							page="78" srcBook="f5ec713c-98cd-41f6-a0a4-4a8eaed55b66"
							karmaKosten="-10" />
					</persona>
					<generatorSrc xsi:type="shr5mngt:FreeStyleGenerator"
						character="//@entries.2/@groups.0/@members.2" generator="//@entries.0/@entries.16/@entries.1"
						state="commited" selectedGroup="//@entries.2/@groups.0"
						characterName="Delvil Rat" selectedSpecies="//@entries.0/@entries.17/@entries.208">
						<selectedType href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
					</generatorSrc>
				</members>
				<members xsi:type="shr5mngt:NonPlayerCharacter"
					chracterSource="//@entries.2/@groups.0/@members.3/@generatorSrc"
					nativeLanguage="//@entries.0/@entries.5/@entries.8" sex="male">
					<persona xsi:type="shr5:MudanPersona"
						beschreibung="Ralf ist Barkeeper in der Kneipe im Vorderhaus von Gu's Wohnung. Gu hängt da regelmäßig ab. "
						name="Ralf" edgeBasis="2" konstitutionBasis="3"
						geschicklichkeitBasis="4" reaktionBasis="3" staerkeBasis="3"
						charismaBasis="4" willenskraftBasis="4" intuitionBasis="3"
						logikBasis="3" spezies="//@entries.0/@entries.2/@entries.0">
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.0">
						</fertigkeiten>
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.0/@fertigkeiten.1" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.1">
						</fertigkeiten>
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.3/@entries.10/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.9/@fertigkeiten.2" />
						<fertigkeiten stufe="4"
							fertigkeit="//@entries.0/@entries.3/@entries.3/@fertigkeiten.2" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.5/@entries.40" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.5/@entries.72" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.19/@entries.4" />
						<fertigkeiten stufe="6"
							fertigkeit="//@entries.0/@entries.19/@entries.3" />
						<fertigkeiten stufe="5"
							fertigkeit="//@entries.0/@entries.19/@entries.2" />
					</persona>
					<generatorSrc xsi:type="shr5mngt:FreeStyleGenerator"
						character="//@entries.2/@groups.0/@members.3" generator="//@entries.0/@entries.16/@entries.1"
						state="commited" selectedGroup="//@entries.2/@groups.0"
						characterName="Ralf" selectedSpecies="//@entries.0/@entries.2/@entries.0">
						<selectedType href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
					</generatorSrc>
				</members>

			</groups>
			<grunts name="Thugs">
				<members count="7" nsc="//@entries.2/@groups.0/@members.0" />
				<leader count="1" nsc="//@entries.2/@groups.0/@members.1" />
			</grunts>



		</entries>


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
			karmaFactor="7">
			<type href="http://urszeidler.de/shr5/1.0#//Spezialisierung" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://urszeidler.de/shr5/1.0#//PersonaZauber" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://urszeidler.de/shr5/1.0#//PersonaKomplexForm" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="5">
			<type href="http://www.eclipse.org/emf/2002/Ecore#//EAttribute" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="2">
			<type href="http://urszeidler.de/shr5/1.0#//PersonaEigenschaft" />
		</characterAdvancements>
		<characterAdvancements xsi:type="shr5mngt:IncreaseCharacterPart"
			karmaFactor="13">
			<type href="http://urszeidler.de/shr5/1.0#//Initation" />
		</characterAdvancements>

	</xsl:template>
	<xsl:template name="vehicle">
		<xsl:attribute name="fahrzeugTyp"><xsl:value-of select="category/text()" /></xsl:attribute>
		<xsl:if test="number(accel/text())">
			<xsl:attribute name="beschleunigung"><xsl:value-of
				select="number(accel/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(speed/text())">
			<xsl:attribute name="geschwindigkeit"><xsl:value-of
				select="number(speed/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(body/text())">
			<xsl:attribute name="rumpf"><xsl:value-of select="number(body/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(armor/text())">
			<xsl:attribute name="panzer"><xsl:value-of
				select="number(armor/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(pilot/text())">
			<xsl:attribute name="pilot"><xsl:value-of
				select="number(pilot/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(sensor/text())">
			<xsl:attribute name="sensor"><xsl:value-of
				select="number(sensor/text())" /></xsl:attribute>
		</xsl:if>


		<xsl:call-template name="gegenstand-basis" />

	</xsl:template>
	<!-- basic named templates -->
	<!-- <xsl:template name="beschreibbar"> -->
	<!-- <xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute> -->
	<!-- <xsl:if test="string-length(doc/text())!=0"> -->
	<!-- <xsl:attribute name="beschreibung"><xsl:value-of select="doc/text()" 
		/></xsl:attribute> -->
	<!-- </xsl:if> -->
	<!-- </xsl:template> -->
	<!-- find the range -->
	<xsl:template name="setRange">
		<xsl:choose>
			<xsl:when test="range/text()">
				<xsl:variable name="rname" select="range/text()" />
				<xsl:for-each select="$ranges">
					<xsl:for-each select="chummer/ranges/*">
						<xsl:if test="category/text()=$rname">
							<xsl:variable name="pos" select="position()-1" />
							<xsl:attribute name="reichweite"><xsl:value-of
								select="concat('//@entries.0/@entries.4/@entries.0/@entries.',$pos)" /></xsl:attribute>
						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
			</xsl:when>
			<xsl:otherwise>
				<xsl:variable name="rname" select="category/text()" />
				<xsl:for-each select="$ranges">
					<xsl:for-each select="chummer/ranges/*">
						<xsl:if test="category/text()=$rname">
							<xsl:variable name="pos" select="position()-1" />
							<xsl:attribute name="reichweite"><xsl:value-of
								select="concat('//@entries.0/@entries.4/@entries.0/@entries.',$pos)" /></xsl:attribute>
						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!-- find the source book <xsl:template name="findSourceBook"> <xsl:param 
		name="aid" /> <xsl:for-each select="$books"> <xsl:for-each select="chummer/books/*"> 
		<xsl:if test="code/text()=$aid"> <xsl:variable name="id_name" select="id/text()" 
		/> <xsl:value-of select="$id_name" /> </xsl:if> </xsl:for-each> </xsl:for-each> 
		</xsl:template> -->
	<!-- find the locaized name -->
	<!-- <xsl:template name="findLocalizedName"> -->
	<!-- <xsl:param name="aid" /> -->
	<!-- <xsl:for-each select="$loc_data"> -->
	<!-- <xsl:for-each select="chummer/chummer/*/*"> -->
	<!-- <xsl:if test="id/text()=$aid"> -->
	<!-- <xsl:variable name="loc_name" select="translate/text()" /> -->
	<!-- <xsl:attribute name="name"><xsl:value-of select="translate/text()" -->
	<!-- /></xsl:attribute> -->

	<!-- <xsl:value-of select="$loc_name" /> -->
	<!-- </xsl:if> -->
	<!-- </xsl:for-each> -->
	<!-- </xsl:for-each> -->
	<!-- </xsl:template> -->

	<!-- <xsl:template name="findLocalizedPage"> -->
	<!-- <xsl:param name="aid" /> -->
	<!-- <xsl:for-each select="$loc_data"> -->
	<!-- <xsl:for-each select="chummer/chummer/*/*"> -->
	<!-- <xsl:if test="id/text()=$aid"> -->
	<!-- <xsl:if test="number(page/text())= page/text()"> -->
	<!-- <xsl:variable name="loc_name" select="page/text()" /> -->
	<!-- <xsl:attribute name="name"><xsl:value-of select="translate/text()" -->
	<!-- /></xsl:attribute> -->

	<!-- <xsl:value-of select="$loc_name" /> -->
	<!-- </xsl:if> -->
	<!-- </xsl:if> -->
	<!-- </xsl:for-each> -->
	<!-- </xsl:for-each> -->
	<!-- </xsl:template> -->

	<!-- <xsl:template name="set_id"> -->
	<!-- <xsl:variable name="aid" select="id/text()" /> -->
	<!-- <xsl:if test="$aid!=''"> -->
	<!-- <xsl:attribute name="xmi:id"><xsl:value-of select="$aid" /></xsl:attribute> -->
	<!-- </xsl:if> -->
	<!-- </xsl:template> -->


	<!-- <xsl:template name="quelle"> -->
	<!-- <xsl:call-template name="set_id" /> -->
	<!-- <xsl:call-template name="simple_quelle" /> -->
	<!-- </xsl:template> -->

	<!-- <xsl:template name="simple_quelle"> -->
	<!-- <xsl:if test="number(page/text())"> -->
	<!-- <xsl:attribute name="page"> -->
	<!-- <xsl:value-of select="number(page/text())" /> -->
	<!-- </xsl:attribute> -->
	<!-- </xsl:if> -->
	<!-- <xsl:attribute name="srcBook">//@entries.0/@entries.0/@entries.0</xsl:attribute> -->

	<!-- <xsl:variable name="sid1" select="source/text()" /> -->
	<!-- <xsl:variable name="srcBookId"> -->
	<!-- <xsl:call-template name="findSourceBook"> -->
	<!-- <xsl:with-param name="aid" select="$sid1" /> -->
	<!-- </xsl:call-template> -->
	<!-- ee -->

	<!-- </xsl:variable> -->
	<!-- <xsl:attribute name="srcBook"> -->
	<!-- <xsl:value-of select="$srcBookId" /> -->
	<!-- </xsl:attribute> -->
	<!-- </xsl:template> -->


	<!-- <xsl:template name="localization"> -->
	<!-- <xsl:variable name="aid1" select="id/text()" /> -->
	<!-- <xsl:variable name="loc_name"> -->
	<!-- <xsl:call-template name="findLocalizedName"> -->
	<!-- <xsl:with-param name="aid" select="$aid1" /> -->
	<!-- </xsl:call-template> -->
	<!-- </xsl:variable> -->
	<!-- <xsl:choose> -->
	<!-- <xsl:when test="not ($loc_name='')"> -->
	<!-- <localizations local="de"> -->
	<!-- <xsl:attribute name="name"><xsl:value-of -->
	<!-- select="$loc_name" /></xsl:attribute> -->
	<!-- <xsl:variable name="loc_page"> -->
	<!-- <xsl:call-template name="findLocalizedPage"> -->
	<!-- <xsl:with-param name="aid" select="$aid1" /> -->
	<!-- </xsl:call-template> -->
	<!-- </xsl:variable> -->
	<!-- <xsl:choose> -->
	<!-- <xsl:when test="$loc_page=''"> -->
	<!-- <xsl:if test="number(page/text())= page/text()"> -->
	<!-- <xsl:attribute name="page"><xsl:value-of -->
	<!-- select="number(page/text())" /></xsl:attribute> -->
	<!-- </xsl:if> -->
	<!-- </xsl:when> -->
	<!-- </xsl:choose> -->
	<!-- </localizations> -->
	<!-- </xsl:when> -->
	<!-- </xsl:choose> -->
	<!-- </xsl:template> -->


	<!-- <xsl:template name="gegenstand-basis"> -->
	<!-- <xsl:attribute name="verfuegbarkeit"><xsl:value-of select="avail/text()" 
		/></xsl:attribute> -->
	<!-- <xsl:if test="number(cost/text())"> -->
	<!-- <xsl:attribute name="wertValue"><xsl:value-of select="number(cost/text())" 
		/></xsl:attribute> -->
	<!-- </xsl:if> -->
	<!-- <xsl:call-template name="beschreibbar" /> -->
	<!-- <xsl:call-template name="quelle" /> -->
	<!-- </xsl:template> -->


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
		<xsl:call-template name="localization" />
		<xsl:for-each select="specs/*">
			<spezialisierungen>
				<xsl:attribute name="name">
				<xsl:value-of select="text()" />
			</xsl:attribute>
			</spezialisierungen>

		</xsl:for-each>

		<!-- <xsl:apply-templates mode="spec" /> -->

	</xsl:template>
	<xsl:template mode="spec" match="specs">
		<spezialisierungen>
			<xsl:value-of select="spec/text()" />
		</spezialisierungen>
	</xsl:template>

	<!-- matcher for the references of the modificators -->
	<!-- <xsl:template name="MATCH"> -->
	<!-- <xsl:param name="matchingName" /> -->
	<!-- <xsl:choose> -->
	<!-- <xsl:when test="$matchingName='AGI'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/geschicklichkeit'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='BOD'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/konstitution'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='STR'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/staerke'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='REA'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//KoerperlicheAttribute/reaktion'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='INT'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/intuition'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='CHA'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/charisma'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='WIL'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/willenskraft'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='LOG'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//GeistigeAttribute/logik'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='MAG'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//BaseMagischePersona/magie'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- <xsl:when test="$matchingName='RES'"> -->
	<!-- <xsl:value-of -->
	<!-- select="'http://urszeidler.de/shr5/1.0#//ResonanzPersona/resonanz'" 
		/> -->
	<!-- </xsl:when> -->
	<!-- </xsl:choose> -->
	<!-- </xsl:template> -->
	<!-- lifestyle -->
	<xsl:template match="//lifestyle" mode="lifestyle">
		<entries xsi:type="shr5:Lifestyle">
			<xsl:call-template name="gegenstand-basis" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<!-- metatype and critter -->
	<xsl:template match="//metatype">
		<entries xsi:type="shr5:Spezies">
			<xsl:call-template name="species-data" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<xsl:template match="//metatype" mode="critter">
		<xsl:choose>
			<xsl:when test="category/text()='Spirits'">
				<xsl:call-template name="geist" />
			</xsl:when>
			<xsl:when test="category/text()='Toxic Spirits'">
				<xsl:call-template name="geist" />
			</xsl:when>
			<xsl:otherwise>
				<entries xsi:type="shr5:Critter">
					<xsl:variable name="aid" select="id/text()" />
					<xsl:if test="$aid!=''">
						<xsl:attribute name="xmi:id"><xsl:value-of
							select="$aid" />
						</xsl:attribute>
					</xsl:if>


					<xsl:call-template name="species-data" />
					<xsl:call-template name="critter-power">
						<xsl:with-param name="tagName" select="'powers'" />
						<xsl:with-param name="path" select="powers/*" />
					</xsl:call-template>
					<xsl:call-template name="localization" />
				</entries>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="geist">
		<entries xsi:type="shr5:Geist">
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="set_id" />
			<xsl:call-template name="quelle" />

			<xsl:call-template name="geist-species" />
			<xsl:call-template name="localization" />
			<xsl:call-template name="critter-power">
				<xsl:with-param name="tagName" select="'powers'" />
				<xsl:with-param name="path" select="powers/*" />
			</xsl:call-template>
			<xsl:call-template name="critter-power">
				<xsl:with-param name="tagName" select="'optionalPowers'" />
				<xsl:with-param name="path" select="optionalpowers/*" />
			</xsl:call-template>

			<xsl:for-each select="skills/*">
				<xsl:variable name="name" select="text()" />
				<xsl:for-each select="$skills">
					<xsl:for-each select="chummer/skills/*">
						<xsl:if test="name/text()=$name">
							<skills>
								<xsl:attribute name="href">
								<xsl:value-of select="concat('#', id/text())" />
							</xsl:attribute>
							</skills>

						</xsl:if>
					</xsl:for-each>
				</xsl:for-each>
			</xsl:for-each>

		</entries>
	</xsl:template>

	<xsl:template name="critter-power">
		<xsl:param name="tagName" />
		<xsl:param name="path" />
		<xsl:for-each select="$path">
			<xsl:variable name="name" select="text()" />
			<xsl:for-each select="$critter-powers">
				<xsl:for-each select="chummer/powers/*">
					<xsl:if test="name/text()=$name">
						<xsl:element name="{$tagName}">
							<xsl:choose>
								<xsl:when test="action/text()='Complex'">
									<xsl:attribute name="handlung">komplex</xsl:attribute>
								</xsl:when>
								<xsl:when test="range/text()='Auto'">
									<xsl:attribute name="handlung">auto</xsl:attribute>
								</xsl:when>
							</xsl:choose>
							<xsl:choose>
								<xsl:when test="range/text()='LOS'">
									<xsl:attribute name="reichweite">blickfeld</xsl:attribute>
								</xsl:when>
								<xsl:when test="range/text()='Special'">
									<xsl:attribute name="reichweite">speziell</xsl:attribute>
								</xsl:when>
								<xsl:when test="range/text()='Self'">
									<xsl:attribute name="reichweite">selbst</xsl:attribute>
								</xsl:when>
								<xsl:when test="range/text()='Touch'">
									<xsl:attribute name="reichweite">beruehrung</xsl:attribute>
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
								<xsl:when test="duration/text()='Always'">
									<xsl:attribute name="dauer">immer</xsl:attribute>
								</xsl:when>
								<xsl:when test="duration/text()='Instant'">
									<xsl:attribute name="dauer">sofort</xsl:attribute>
								</xsl:when>
								<xsl:when test="duration/text()='Sustained'">
									<xsl:attribute name="dauer">aufrechterhalten</xsl:attribute>
								</xsl:when>
								<xsl:when test="duration/text()='Permanent'">
									<xsl:attribute name="dauer">permanent</xsl:attribute>
								</xsl:when>
							</xsl:choose>
							<xsl:call-template name="beschreibbar" />
							<!-- <xsl:call-template name="quelle" /> -->
							<xsl:call-template name="simple_quelle" />
							<xsl:call-template name="localization" />
						</xsl:element>
					</xsl:if>
				</xsl:for-each>
			</xsl:for-each>
		</xsl:for-each>

	</xsl:template>

	<xsl:template name="geist-species">
		<xsl:if test="number(substring-after(bodmin/text(),'F'))">
			<xsl:attribute name="konstitutionBasis"><xsl:value-of
				select="number(substring-after(bodmin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(agimin/text(),'F'))">
			<xsl:attribute name="geschicklichkeitBasis"><xsl:value-of
				select="number(substring-after(agimin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(reamin/text(),'F'))">
			<xsl:attribute name="reaktionBasis"><xsl:value-of
				select="number(substring-after(reamin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(strmin/text(),'F'))">
			<xsl:attribute name="staerkeBasis"><xsl:value-of
				select="number(substring-after(strmin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(chamin/text(),'F'))">
			<xsl:attribute name="charismaBasis"><xsl:value-of
				select="number(substring-after(chamin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(wilmin/text(),'F'))">
			<xsl:attribute name="willenskraftBasis"><xsl:value-of
				select="number(substring-after(wilmin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(intmin/text(),'F'))">
			<xsl:attribute name="intuitionBasis"><xsl:value-of
				select="number(substring-after(intmin/text(),'F'))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(logmin/text(),'F'))">
			<xsl:attribute name="logikBasis"><xsl:value-of
				select="number(substring-after(logmin/text(),'F'))" /></xsl:attribute>
		</xsl:if>

	</xsl:template>


	<xsl:template name="species-data">
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
			<xsl:attribute name="laufen"><xsl:value-of select="number(walk/text())" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(sprint/text())">
			<xsl:attribute name="sprinten"><xsl:value-of
				select="number(sprint/text())" /></xsl:attribute>
		</xsl:if>

		<xsl:call-template name="beschreibbar" />
		<xsl:call-template name="quelle" />
		<xsl:call-template name="mods" />
		<!-- <xsl:call-template name="localization"/> -->
		<angriff name="unarmed" schadenscode="(STR)P" />

	</xsl:template>

	<xsl:template match="//complexform">
		<entries xsi:type="shr5:KomplexeForm">

			<xsl:attribute name="schwund"><xsl:value-of select="fv/text()" /></xsl:attribute>
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
			<xsl:choose>
				<xsl:when test="target/text()='File'">
					<xsl:attribute name="ziel">datei</xsl:attribute>
				</xsl:when>
				<xsl:when test="target/text()='Device'">
					<xsl:attribute name="ziel">geraet</xsl:attribute>
				</xsl:when>
				<xsl:when test="target/text()='Self'">
					<xsl:attribute name="ziel">selbst</xsl:attribute>
				</xsl:when>
				<xsl:when test="target/text()='Persona'">
					<xsl:attribute name="ziel">persona</xsl:attribute>
				</xsl:when>
				<xsl:when test="target/text()='Sprite'">
					<xsl:attribute name="ziel">sprite</xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<!-- metamagic -->
	<xsl:template match="//metamagic">
		<entries xsi:type="shr5:MetaMagie">
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<!-- mentors -->
	<xsl:template match="//mentor">
		<entries xsi:type="shr5:Schutzgeist">
			<xsl:attribute name="vorteile"><xsl:value-of select="advantage/text()" /></xsl:attribute>
			<xsl:attribute name="nachteile"><xsl:value-of select="disadvantage/text()" /></xsl:attribute>

			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<!-- zauber -->
	<xsl:template match="//spell">
		<entries xsi:type="shr5:Zauber">
			<xsl:attribute name="merkmale"><xsl:value-of select="descriptor/text()" /></xsl:attribute>
			<xsl:attribute name="kategorie"><xsl:value-of select="category/text()" /></xsl:attribute>
			<xsl:attribute name="schaden"><xsl:value-of select="damage/text()" /></xsl:attribute>
			<xsl:attribute name="entzug"><xsl:value-of select="dv/text()" /></xsl:attribute>

			<xsl:call-template name="zauber-types" />
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>

	<xsl:template name="zauber-types">
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
				<xsl:call-template name="quelle" />
				<xsl:call-template name="mods" />
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
	</xsl:template>
	<!-- quallity -->
	<xsl:template match="//quality">
		<entries xsi:type="shr5:PersonaEigenschaft">
			<xsl:if test="number(karma/text())">
				<xsl:attribute name="karmaKosten">
				<xsl:value-of select="number(karma/text())" />
				</xsl:attribute>
			</xsl:if>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="mods" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<!-- skill -->
	<xsl:template match="//skill">
		<xsl:if test="string-length(skillgroup/text())=0">
			<xsl:choose>
				<xsl:when test="category/text()='Language'">
					<entries xsi:type="shr5:Sprachfertigkeit">
						<xsl:call-template name="set_id" />
						<xsl:call-template name="skill" />
					</entries>
				</xsl:when>
				<xsl:when
					test="category/text()!='Language' and name(..)='knowledgeskills' ">
					<entries xsi:type="shr5:Wissensfertigkeit">
						<xsl:call-template name="set_id" />
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
			<xsl:attribute name="srcBook">//@entries.0/@entries.0/@entries.0</xsl:attribute>
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
			<!-- <xsl:call-template name="localization"/> -->
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
			<xsl:call-template name="localization" />
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
			<xsl:call-template name="localization" />

		</entries>
	</xsl:template>
	<xsl:template match="//program">
		<entries xsi:type="shr5:CommonProgram">
			<xsl:choose>
				<xsl:when test="category/text()='Hacking'">
					<xsl:attribute name="programType">
					<xsl:value-of select="'hackingProgram'" />
									</xsl:attribute>
					<xsl:attribute name="verfuegbarkeit"><xsl:value-of
						select="'6R'" /></xsl:attribute>
					<xsl:attribute name="wertValue"><xsl:value-of
						select="250" /></xsl:attribute>
				</xsl:when>
				<xsl:otherwise>
					<xsl:attribute name="programType">
					<xsl:value-of select="'defaultProgram'" />
									</xsl:attribute>

					<xsl:attribute name="wertValue"><xsl:value-of
						select="80" /></xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
			<xsl:call-template name="beschreibbar" />
			<xsl:call-template name="quelle" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>


	<xsl:template match="//gear">
		<xsl:choose>
			<xsl:when
				test="category/text()='Ammunition' and  starts-with(name/text(),'Ammo:' )">
				<entries xsi:type="shr5:Munition">
					<xsl:if test="number(costfor/text())">
						<xsl:attribute name="proAnzahl">
					<xsl:value-of select="costfor/text()" />
					</xsl:attribute>
						<xsl:attribute name="anzahl">
					<xsl:value-of select="costfor/text()" />
					</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(weaponbonus/damage/text())">
						<xsl:attribute name="damageMod">
					<xsl:value-of select="weaponbonus/damage/text()" />
					</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(weaponbonus/ap/text())">
						<xsl:attribute name="armorMod">
					<xsl:value-of select="weaponbonus/ap/text()" />
					</xsl:attribute>
					</xsl:if>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Rigger Command Consoles'">
				<entries xsi:type="shr5:RiggerCommandConsole">
					<xsl:if test="number(devicerating/text())">
						<xsl:attribute name="deviceRating">
						<xsl:value-of select="devicerating/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(firewall/text())">
						<xsl:attribute name="firewallBasis">
						<xsl:value-of select="firewall/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(dataprocessing/text())">
						<xsl:attribute name="datenverarbeitungBasis">
						<xsl:value-of select="dataprocessing/text()" />
						</xsl:attribute>
					</xsl:if>

					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
					<mods wert="1">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
					</mods>
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Cyberdecks'">
				<entries xsi:type="shr5:Cyberdeck">
					<xsl:if test="number(devicerating/text())">
						<xsl:attribute name="deviceRating">
						<xsl:value-of select="devicerating/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(programs/text())">
						<xsl:attribute name="programSlots">
						<xsl:value-of select="programs/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(attack/text())">
						<xsl:attribute name="attribute1">
						<xsl:value-of select="attack/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(sleaze/text())">
						<xsl:attribute name="attribute2">
						<xsl:value-of select="sleaze/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(dataprocessing/text())">
						<xsl:attribute name="attribute3">
						<xsl:value-of select="dataprocessing/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:if test="number(firewall/text())">
						<xsl:attribute name="attribute4">
						<xsl:value-of select="firewall/text()" />
						</xsl:attribute>
					</xsl:if>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
					<configuration
						href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute1" />
					<configuration
						href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute2" />
					<configuration
						href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute3" />
					<configuration
						href="http://urszeidler.de/shr5/1.0#//Cyberdeck/attribute4" />
					<mods wert="1">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/universalDataConnector" />
					</mods>
					<mods wert="1">
						<attribut
							href="http://urszeidler.de/shr5/1.0#//CyberwareModifikatioren/simRig" />
					</mods>
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Commlinks'">
				<entries xsi:type="shr5:Commlink">
					<xsl:if test="number(devicerating/text())">
						<xsl:attribute name="deviceRating">
					<xsl:value-of select="devicerating/text()" />
					</xsl:attribute>
					</xsl:if>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Common Programs'">
				<entries xsi:type="shr5:CommonProgram">
					<!-- <xsl:attribute name="programType"> -->
					<!-- <xsl:value-of select="category/text()" /> -->
					<!-- </xsl:attribute> -->
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Software'">
				<xsl:choose>
					<xsl:when test="name/text()='Datasoft'">
						<entries xsi:type="shr5:Datasoft">
							<!-- <xsl:attribute name="type"> -->
							<!-- <xsl:value-of select="'dataSoft'" /> -->
							<!-- </xsl:attribute> -->
							<xsl:attribute name="verfuegbarkeit"><xsl:value-of
								select="'4'" /></xsl:attribute>
							<xsl:attribute name="wertValue"><xsl:value-of
								select="120" /></xsl:attribute>
							<xsl:call-template name="beschreibbar" />
							<xsl:call-template name="quelle" />
							<xsl:call-template name="localization" />
						</entries>
					</xsl:when>
					<xsl:when test="name/text()='Mapsoft'">
						<entries xsi:type="shr5:ConsumerSoft">
							<xsl:attribute name="type">
								<xsl:value-of select="'defaultSoft'" />
									</xsl:attribute>
							<xsl:attribute name="verfuegbarkeit"><xsl:value-of
								select="'4'" /></xsl:attribute>
							<xsl:attribute name="wertValue"><xsl:value-of
								select="150" /></xsl:attribute>
							<xsl:call-template name="beschreibbar" />
							<xsl:call-template name="quelle" />
							<xsl:call-template name="localization" />
						</entries>
					</xsl:when>
					<xsl:when test="name/text()='Shopsoft'">
						<entries xsi:type="shr5:ConsumerSoft">
							<xsl:attribute name="type">
								<xsl:value-of select="'shopSoft'" />
									</xsl:attribute>
							<xsl:attribute name="verfuegbarkeit"><xsl:value-of
								select="'4'" /></xsl:attribute>
							<xsl:attribute name="wertValue"><xsl:value-of
								select="150" /></xsl:attribute>
							<xsl:call-template name="beschreibbar" />
							<xsl:call-template name="quelle" />
							<xsl:call-template name="localization" />
						</entries>
					</xsl:when>

					<xsl:otherwise>
						<!-- <xsl:attribute name="type"> -->
						<!-- <xsl:value-of select="'defaultSoft'" /> -->
						<!-- </xsl:attribute> -->

						<!-- <xsl:attribute name="wertValue"><xsl:value-of -->
						<!-- select="80" /></xsl:attribute> -->
						<!-- <xsl:call-template name="localization"/> -->
					</xsl:otherwise>
				</xsl:choose>


			</xsl:when>
			<xsl:when test="category/text()='Drugs'">
				<entries xsi:type="shr5:Drug">
					<xsl:attribute name="proAnzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
					<xsl:attribute name="anzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>
			<xsl:when test="category/text()='Toxins'">
				<entries xsi:type="shr5:Toxin">
					<xsl:attribute name="proAnzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
					<xsl:attribute name="anzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>

			<xsl:otherwise>
				<entries xsi:type="shr5:Gegenstand">
					<xsl:attribute name="kategorie"><xsl:value-of
						select="category/text()" /></xsl:attribute>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:otherwise>
		</xsl:choose>

	</xsl:template>
	<xsl:template match="//vehicle">
		<xsl:choose>
			<xsl:when test="starts-with(category/text(),'Drones:')">
				<entries xsi:type="shr5:Drohne">
					<xsl:if test="number(handling/text())">
						<xsl:attribute name="handling"><xsl:value-of
							select="number(handling/text())" /></xsl:attribute>
					</xsl:if>
					<xsl:call-template name="vehicle" />
				</entries>
			</xsl:when>
			<xsl:when
				test="category/text()='Bikes' or category/text()='Cars' or category/text()='Trucks'">
				<entries xsi:type="shr5:Bodenfahrzeug">
					<xsl:if test="number(seats/text())">
						<xsl:attribute name="sitze"><xsl:value-of
							select="number(seats/text())" /></xsl:attribute>
					</xsl:if>
					<xsl:if test="number(substring-before(handling/text(),'/'))">
						<xsl:attribute name="handling"><xsl:value-of
							select="number(substring-before(handling/text(),'/'))" /></xsl:attribute>
					</xsl:if>
					<xsl:if test="number(substring-after(handling/text(),'/'))">
						<xsl:attribute name="handlingGelaende"><xsl:value-of
							select="number(substring-after(handling/text(),'/'))" /></xsl:attribute>
					</xsl:if>
					<xsl:call-template name="vehicle" />
				</entries>
			</xsl:when>
			<xsl:otherwise>
				<entries xsi:type="shr5:PassagierFahrzeug">
					<xsl:if test="number(seats/text())">
						<xsl:attribute name="sitze"><xsl:value-of
							select="number(seats/text())" /></xsl:attribute>
					</xsl:if>
					<xsl:if test="number(handling/text())">
						<xsl:attribute name="handling"><xsl:value-of
							select="number(handling/text())" /></xsl:attribute>
					</xsl:if>
					<xsl:call-template name="vehicle" />
				</entries>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<xsl:template match="armor">
		<xsl:choose>
			<xsl:when
				test="not(starts-with(armor/text(),'+'))and(   category/text()='Armor' or category/text()='High-Fashion Armor Clothing' or category/text()='Specialty Armor' or category/text()='Clothing')">
				<entries xsi:type="shr5:Kleidung">
					<xsl:if test="number(armor/text())">
						<xsl:attribute name="ruestung"><xsl:value-of
							select="number(armor/text())" /></xsl:attribute>
					</xsl:if>
					<xsl:call-template name="gegenstand-basis" />
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>
			<xsl:when test="starts-with(armor/text(),'+' )">
				<entries xsi:type="shr5:Gegenstand">
					<xsl:call-template name="gegenstand-basis" />
					<mods>
						<xsl:if test="number(armor/text())">
							<xsl:attribute name="wert">
				<xsl:value-of select="number(armor/text())" />
				</xsl:attribute>
						</xsl:if>
						<!-- <attribut> -->
						<xsl:attribute name="attribut">
							<xsl:value-of
							select="'http://urszeidler.de/shr5/1.0#//Panzerung/panzer'" />
					</xsl:attribute>
						<!-- </attribut> -->
					</mods>
					<xsl:call-template name="localization" />
				</entries>
			</xsl:when>

		</xsl:choose>
	</xsl:template>

	<!-- weapon -->
	<xsl:template match="weapon">
		<xsl:if test="type/text()='Melee'">
			<entries xsi:type="shr5:Nahkampfwaffe">
				<xsl:if test="number(reach/text())">
					<xsl:attribute name="reichweite"><xsl:value-of
						select="number(reach/text())" /></xsl:attribute>
				</xsl:if>

				<xsl:variable name="fert-id">
					<xsl:call-template name="findSkill">
						<xsl:with-param name="skillname" select="category/text()" />
					</xsl:call-template>
				</xsl:variable>
				<xsl:if test="$fert-id!=''">
					<xsl:attribute name="fertigkeit">
						<xsl:value-of select="$fert-id"></xsl:value-of>
					</xsl:attribute>
				</xsl:if>
				<xsl:call-template name="gegenstand-basis" />
				<xsl:call-template name="waffe" />
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
		<xsl:if test="type/text()='Ranged' and category/text()='Bows'">
			<entries xsi:type="shr5:Projektilwaffe">
				<xsl:call-template name="gegenstand-basis" />

				<xsl:call-template name="setRange" />
				<xsl:call-template name="waffe" />
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
		<xsl:if
			test="type/text()='Ranged' and category/text()!='Gear' and category/text()!='Bows'">
			<entries xsi:type="shr5:Feuerwaffe">
				<xsl:call-template name="gegenstand-basis" />

				<xsl:call-template name="waffe" />
				<xsl:if test="number(substring-before(ammo/text(),'('))">
					<xsl:attribute name="kapazitaet">
				<xsl:value-of select="number(substring-before(ammo/text(),'('))" />
				</xsl:attribute>
					<xsl:choose>
						<xsl:when test="substring-after(ammo/text(),'(')='m)'">
							<xsl:attribute name="munitionstyp">
				<xsl:value-of select="'Clip'" />
				</xsl:attribute>
						</xsl:when>

						<xsl:when test="substring-after(ammo/text(),'(')='c)'">
							<xsl:attribute name="munitionstyp">
				<xsl:value-of select="'Streifen'" />
				</xsl:attribute>
						</xsl:when>

						<xsl:when test="substring-after(ammo/text(),'(')='cy)'">
							<xsl:attribute name="munitionstyp">
				<xsl:value-of select="'Trommel'" />
				</xsl:attribute>
						</xsl:when>
					</xsl:choose>
				</xsl:if>
				<xsl:if test="number(rc/text())">
					<xsl:attribute name="rueckstoss"><xsl:value-of
						select="number(rc/text())" /></xsl:attribute>
				</xsl:if>
				<xsl:call-template name="setRange" />
				<!-- <xsl:call-template name="findRange"> <xsl:with-param name="rname" 
					select="category/text()"/> </xsl:call-template> -->
				<!-- <xsl:choose> -->
				<!-- <xsl:when test="range/text()"> -->
				<!-- <xsl:variable name="rname" select="range/text()" /> -->
				<!-- <xsl:for-each select="$ranges"> -->
				<!-- <xsl:for-each select="chummer/ranges/*"> -->
				<!-- <xsl:if test="category/text()=$rname"> -->
				<!-- <xsl:variable name="pos" select="position()-1" /> -->
				<!-- <xsl:attribute name="reichweite"><xsl:value-of -->
				<!-- select="concat('//@entries.0/@entries.1/@entries.',$pos)" /></xsl:attribute> -->
				<!-- </xsl:if> -->
				<!-- </xsl:for-each> -->
				<!-- </xsl:for-each> -->
				<!-- </xsl:when> -->
				<!-- <xsl:otherwise> -->
				<!-- <xsl:variable name="rname" select="category/text()" /> -->
				<!-- <xsl:for-each select="$ranges"> -->
				<!-- <xsl:for-each select="chummer/ranges/*"> -->
				<!-- <xsl:if test="category/text()=$rname"> -->
				<!-- <xsl:variable name="pos" select="position()-1" /> -->
				<!-- <xsl:attribute name="reichweite"><xsl:value-of -->
				<!-- select="concat('//@entries.0/@entries.1/@entries.',$pos)" /></xsl:attribute> -->
				<!-- </xsl:if> -->
				<!-- </xsl:for-each> -->
				<!-- </xsl:for-each> -->
				<!-- </xsl:otherwise> -->
				<!-- </xsl:choose> -->

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
							<xsl:if test="name/text()=$aid">
								<einbau>
									<xsl:choose>
										<xsl:when test="mount/text()='Barrel'">
											<xsl:attribute name="ep"><xsl:value-of select="'Lauf'" /></xsl:attribute>
										</xsl:when>
										<xsl:when test="mount/text()='Top'">
											<xsl:attribute name="ep"><xsl:value-of select="'Oben'" /></xsl:attribute>
										</xsl:when>
										<xsl:when test="mount/text()='Under'">
											<xsl:attribute name="ep"><xsl:value-of select="'Unten'" /></xsl:attribute>
										</xsl:when>
									</xsl:choose>
									
									<xsl:call-template name="set_parentid" />
									<xsl:call-template name="beschreibbar" />
									<xsl:call-template name="simple_quelle" />
									<xsl:call-template name="localization" />
								</einbau>
							</xsl:if>
						</xsl:for-each>
					</xsl:for-each>
				</xsl:for-each>
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>