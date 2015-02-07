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
	<!-- resources -->
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
	<xsl:variable name="tradition"
		select="document(concat($path,'/traditions.xml'),/)" />
	<xsl:variable name="books"
		select="document(concat($path,'/books.xml'),/)" />
	<!-- basic definition -->
	<xsl:variable name="source_cr"
		select="'f5ec713c-98cd-41f6-a0a4-4a8eaed55b66'" />
	<xsl:variable name="skill_achery"
		select="'1537ca5c-fa93-4c05-b073-a2a0eed91b8e'" />
	<xsl:variable name="skill_automatics"
		select="'788b387b-ee41-4e6a-bf22-481a8cc4cf9f'" />
	<xsl:variable name="skill_pistols"
		select="'adf31a50-b228-4e09-a09c-46ab9f5e59a1'" />
	<xsl:variable name="skill_longarms"
		select="'64088b25-de37-4d71-8800-4a430fde08af'" />


	<xsl:include href="shr5-functions.xsl" />
	<xsl:template match="/">
		<shr5:ShrList xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
			xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" name="all">
			<entries xsi:type="shr5:ShrList" name="resourcen">
				<entries xsi:type="shr5:ShrList" name="Sourcebooks">
					<xsl:for-each select="$books">
						<xsl:for-each select="chummer/books/*">
							<entries xsi:type="shr5:SourceBook" startShrTime="2072-12-13T17:51:44.000+0100"
								endShrTime="2075-12-13T17:51:44.000+0100">
								<xsl:attribute name="beschreibung"><xsl:value-of
									select="url/text()" /></xsl:attribute>
								<xsl:call-template name="set_id" />
								<xsl:call-template name="beschreibbar" />
							</entries>
						</xsl:for-each>
					</xsl:for-each>
				</entries>
				<entries xsi:type="shr5:ShrList" name="generators">
					<xsl:for-each select="$shr5CharacterBuilder">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>


				</entries>
				<entries xsi:type="shr5:ShrList" name="Gear">
					<xsl:for-each select="$weapons">
						<xsl:apply-templates select="node()" />
					</xsl:for-each>
					<entries xsi:type="shr5:ShrList" name="Melee">
						<xsl:for-each select="$weapons">
							<xsl:for-each select="chummer/weapons/*">
								<xsl:if test="type/text()='Melee'">
									<xsl:call-template name="nahkamfwaffwe" />
								</xsl:if>
							</xsl:for-each>
						</xsl:for-each>
					</entries>
					<entries xsi:type="shr5:ShrList" name="Projectileweapon">
						<xsl:for-each select="$weapons">
							<xsl:for-each select="chummer/weapons/*">
								<xsl:if
									test="type/text()='Ranged' and (category/text()='Bows' or category/text()='Crossbows')">
									<xsl:call-template name="projectileweapon" />
								</xsl:if>
							</xsl:for-each>
						</xsl:for-each>
					</entries>
					<entries xsi:type="shr5:ShrList" name="Firearm">
						<xsl:for-each select="$weapons">
							<xsl:for-each select="chummer/weapons/*">
								<xsl:if
									test="type/text()='Ranged' and category/text()!='Gear' and category/text()!='Bows' and category/text()!='Crossbows'">
									<xsl:call-template name="firearm" />
								</xsl:if>
							</xsl:for-each>
						</xsl:for-each>
					</entries>
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
					<xsl:for-each select="$tradition">
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
		match="ranges|gears|armors|skills|knowledgeskills|cyberwares|weapons|powers
		|skillgroups|metatypes|spells|qualities|biowares|vehicles|complexforms|mentors
		|metamagics|accessories|traditions">
		<entries xsi:type="shr5:ShrList">
			<xsl:attribute name="name"><xsl:value-of select="name()" /></xsl:attribute>
			<xsl:apply-templates />
		</entries>
	</xsl:template>
	<!-- the generator -->
	<xsl:template match="bonus" mode="gen" />
	<xsl:template match="//gameplayoption">
		<entries xsi:type="shr5mngt:Shr5System" karmaToResourceFactor="2000"
			characterAdvancements="_BtZ9QN0CEeOvVYoRsPZlnA" karmaToMagicFactor="5"
			skillMax="6" numberOfSpecalism="1" karmaToConnectionFactor="2"
			maxResourceToKeep="5000" knowlegeSkillFactor="2" maxKarmaToKeep="7"
			numberOfMaxAttributes="1" boundSprititServiceCost="1">
			<xsl:attribute name="maxKarmaToResources"><xsl:value-of select="maxnuyen/text()" /></xsl:attribute>
			<xsl:attribute name="charismaToConnectionFactor"><xsl:value-of
				select="contactmultiplier/text()" /></xsl:attribute>
			<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
			<xsl:attribute name="karmaPoints"><xsl:value-of select="karma/text()" /></xsl:attribute>
			<xsl:attribute name="srcBook"><xsl:value-of select="$source_cr" /></xsl:attribute>
			<xsl:call-template name="set_id" />
			<applicableGenerators
				href="http://urszeidler.de/shr5mngt/1.0#//Shr5Generator" />
			<xsl:variable name="type" select="name/text()" />
			<xsl:for-each select="$shr5CharacterBuilder">
				<xsl:for-each select="chummer/priorities/*">
					<xsl:choose>
						<xsl:when test="category/text()='Resources'">
							<xsl:if test="$type=gameplayoption/text()">
								<priorities xsi:type="shr5mngt:Resourcen">
									<xsl:attribute name="categorieName"><xsl:value-of
										select="value/text()" /></xsl:attribute>
									<xsl:attribute name="resource"><xsl:value-of
										select="resources/text()" /></xsl:attribute>
									<xsl:call-template name="set_id" />
								</priorities>
							</xsl:if>
						</xsl:when>
						<xsl:when test="category/text()='Skills'">
							<priorities xsi:type="shr5mngt:Skill">
								<xsl:attribute name="categorieName"><xsl:value-of
									select="value/text()" /></xsl:attribute>
								<xsl:attribute name="skillPoints">
									<xsl:value-of select="skills/text()" />
								</xsl:attribute>
								<xsl:attribute name="groupPoints">
									<xsl:value-of select="skillgroups/text()" />
								</xsl:attribute>
								<xsl:call-template name="set_id" />
							</priorities>
						</xsl:when>
						<xsl:when test="category/text()='Attributes'">
							<priorities xsi:type="shr5mngt:Attributes">
								<xsl:attribute name="categorieName"><xsl:value-of
									select="value/text()" /></xsl:attribute>
								<xsl:attribute name="attibutePoints"><xsl:value-of
									select="attributes/text()" /></xsl:attribute>
							</priorities>
						</xsl:when>
						<xsl:when test="category/text()='Heritage'">
							<xsl:variable name="cat" select="value/text()" />
							<xsl:for-each select="metatypes/*">
								<priorities xsi:type="shr5mngt:MetaType">
									<xsl:attribute name="specialPoints"><xsl:value-of
										select="value/text()" /></xsl:attribute>
									<xsl:attribute name="categorieName"><xsl:value-of
										select="$cat" /></xsl:attribute>
									<xsl:variable name="metatype" select="name/text()" />
									<xsl:for-each select="$metatypes">
										<xsl:for-each select="chummer/metatypes/*">
											<xsl:if test="name/text()=$metatype">
												<xsl:attribute name="choosableTypes"><xsl:value-of
													select="id/text()" /></xsl:attribute>
											</xsl:if>
										</xsl:for-each>
									</xsl:for-each>
								</priorities>
							</xsl:for-each>
						</xsl:when>
						<xsl:when test="category/text()='Talent'">
							<xsl:variable name="cat" select="value/text()" />
							<xsl:for-each select="talents/*">
								<xsl:choose>
									<xsl:when
										test="value/text()='Magician' or value/text()='Mystic Adept' or value/text()='Aspected Magician'">
										<priorities xsi:type="shr5mngt:Spellcaster">
											<xsl:attribute name="categorieName"><xsl:value-of
												select="$cat" /></xsl:attribute>
											<xsl:attribute name="magic"><xsl:value-of
												select="magic/text()" /></xsl:attribute>
											<xsl:call-template name="skill-options" />
											<xsl:if test="number(spells/text())">
												<xsl:attribute name="spellPoints"><xsl:value-of
													select="spells/text()" /></xsl:attribute>
											</xsl:if>
											<xsl:choose>
												<xsl:when test="value/text()='Magician'">
													<xsl:attribute name="selectableSkills">
														<xsl:value-of
														select="'fc89344f-daa6-438e-b61d-23f10dd13e44 dfba7c09-3d95-43fd-be75-39b3e8b22cd3 51e34c6c-b07f-45f4-8a5e-8f2b617ed32f c4367a39-4065-4b1d-aa62-e9dce377e452 3db81bcc-264b-47e1-847c-06bdacd88973'" />
													</xsl:attribute>
													<selectableTypes href="http://urszeidler.de/shr5/1.0#//Magier" />
												</xsl:when>
												<xsl:when test="value/text()='Mystic Adept'">
													<xsl:attribute name="selectableSkills">
														<xsl:value-of
														select="'fc89344f-daa6-438e-b61d-23f10dd13e44 dfba7c09-3d95-43fd-be75-39b3e8b22cd3 51e34c6c-b07f-45f4-8a5e-8f2b617ed32f c4367a39-4065-4b1d-aa62-e9dce377e452 3db81bcc-264b-47e1-847c-06bdacd88973'" />
													</xsl:attribute>
													<selectableTypes
														href="http://urszeidler.de/shr5/1.0#//MysticAdept" />
												</xsl:when>
												<xsl:when test="value/text()='Aspected Magician'">
													<xsl:attribute name="selectableSkills">
														<xsl:value-of
														select="'fc89344f-daa6-438e-b61d-23f10dd13e44 dfba7c09-3d95-43fd-be75-39b3e8b22cd3 51e34c6c-b07f-45f4-8a5e-8f2b617ed32f c4367a39-4065-4b1d-aa62-e9dce377e452 3db81bcc-264b-47e1-847c-06bdacd88973'" />
													</xsl:attribute>
													<selectableTypes
														href="http://urszeidler.de/shr5/1.0#//AspektMagier" />
												</xsl:when>
											</xsl:choose>
										</priorities>
									</xsl:when>
									<xsl:when test="value/text()='Adept'">
										<priorities xsi:type="shr5mngt:Adept">
											<xsl:attribute name="categorieName"><xsl:value-of
												select="$cat" /></xsl:attribute>
											<xsl:attribute name="magic"><xsl:value-of
												select="magic/text()" /></xsl:attribute>
											<xsl:call-template name="skill-options" />
											<xsl:if test="value/text()='Adept'">
												<xsl:attribute name="selectableSkills">
														<xsl:value-of
													select="'a9fa961d-07e5-46da-8edc-403ae3e6cc75 1531b2d8-6116-4be4-87b0-232dba1fc447 f510ccc3-cf95-4461-b2f7-e966daaa5a91 9cff9aa7-d092-4f89-8b7b-3ab835818874 0dbcb9cd-f824-4b5d-a387-90d33318b04c 89ee1730-053a-400f-a13a-4fbadae015f0 23c3320c-5010-4b2e-ac46-76f0a86af0b9 04e1eb3e-e82d-485b-a7fd-1e677df2a070'" />
												</xsl:attribute>
												<selectableTypes href="http://urszeidler.de/shr5/1.0#//KiAdept" />
											</xsl:if>
										</priorities>
									</xsl:when>
									<xsl:when test="value/text()='Technomancer'">
										<priorities xsi:type="shr5mngt:Technomancer"
											selectableSkills="f338d383-ffd8-4ff8-b99b-cf4c2ed1b159 3a38bbcf-38b0-435b-98f2-4ce8c50e8490 64eed2e9-e61c-4cba-81d4-18a612cf2df6"
											selectableSkillGroups="_EMFlODnTEeSe6_w6Jrbqxg">
											<xsl:attribute name="categorieName"><xsl:value-of
												select="$cat" /></xsl:attribute>
											<xsl:attribute name="complexForms"><xsl:value-of
												select="cfp/text()" /></xsl:attribute>
											<xsl:attribute name="resonanz"><xsl:value-of
												select="resonance/text()" /></xsl:attribute>
											<xsl:call-template name="skill-options" />
											<selectableTypes
												href="http://urszeidler.de/shr5/1.0#//Technomancer" />
										</priorities>
									</xsl:when>
								</xsl:choose>
							</xsl:for-each>
						</xsl:when>
						<xsl:otherwise>

						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</xsl:for-each>
			<priorities xsi:type="shr5mngt:Mudan" categorieName="E">
				<selectableTypes href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
			</priorities>
			<xsl:call-template name="lifestyle-to-money" />
			<xsl:call-template name="generator-instructions" />
		</entries>

	</xsl:template>
	<xsl:template match="gameplayoptions">
		<entries xsi:type="shr5:ShrList" name="generators">

			<xsl:apply-templates />

			<entries xsi:type="shr5mngt:Shr5System"
				karmaToResourceFactor="2000" karmaToMagicFactor="5"
				characterAdvancements="//@entries.0/@entries.16/@entries.2"
				charismaToConnectionFactor="3" maxKarmaToResources="10" skillMax="6"
				numberOfSpecalism="1" maxResourceToKeep="5000" knowlegeSkillFactor="2"
				maxKarmaToKeep="7" numberOfMaxAttributes="1"
				boundSprititServiceCost="1" karmaToConnectionFactor="2">
				<xsl:attribute name="name"><xsl:value-of select="name/text()" /></xsl:attribute>
				<xsl:attribute name="karmaPoints"><xsl:value-of select="karma/text()" /></xsl:attribute>
				<xsl:attribute name="srcBook">//@entries.0/@entries.0/@entries.0</xsl:attribute>
				<xsl:apply-templates mode="gen" />
				<priorities xsi:type="shr5mngt:Mudan" categorieName="E">
					<selectableTypes href="http://urszeidler.de/shr5/1.0#//MudanPersona" />
				</priorities>
				<xsl:call-template name="generator-instructions" />

				<xsl:call-template name="lifestyle-to-money" />
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
				<xsl:call-template name="lifestyle-to-money" />

			</entries>
		</entries>
	</xsl:template>
	<!-- vehicle -->
	<xsl:template name="examples">
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

	<xsl:template name="skill-options">
		<xsl:if test="number(skillqty/text())">
			<xsl:attribute name="skillNumber"><xsl:value-of select="skillqty/text()" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(skillval/text())">
			<xsl:attribute name="skillValue"><xsl:value-of select="skillval/text()" /></xsl:attribute>
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

	<xsl:template match="//lifestyle" mode="lifestyle">
		<entries xsi:type="shr5:Lifestyle" faelligkeitsIntervall="1">
			<xsl:choose>
				<xsl:when test="increment/text()='day'">
					<xsl:attribute name="unit"><xsl:value-of
						select="'day'" />  
		</xsl:attribute>
				</xsl:when>
				<xsl:otherwise>
					<xsl:attribute name="unit"><xsl:value-of
						select="'month'" />
					</xsl:attribute>
				</xsl:otherwise>
			</xsl:choose>
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


		<xsl:if test="number(substring-after(run/text(),'AGI*' ))">
			<xsl:attribute name="rennen"><xsl:value-of
				select="number(substring-after(run/text(),'AGI*' ))" /></xsl:attribute>
		</xsl:if>
		<xsl:if test="number(substring-after(walk/text(),'AGI*' ))">
			<xsl:attribute name="laufen"><xsl:value-of
				select="number(substring-after(walk/text(),'AGI*' ))" /></xsl:attribute>
		</xsl:if>
		<!-- <xsl:if test="substring(1,1,sprint/text())"> -->
		<xsl:attribute name="sprinten"><xsl:value-of
			select="substring(sprint/text(),2,1)" /></xsl:attribute>
		<!-- </xsl:if> -->

		<xsl:call-template name="beschreibbar" />
		<xsl:call-template name="quelle" />
		<xsl:call-template name="mods" />
		<!-- <xsl:call-template name="localization"/> -->
		<angriff name="unarmed" fertigkeit="4fcd40cb-4b02-4b7e-afcb-f44d46cd5706"
			schadenscode="(STR)P" />

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
	<!-- traditions -->
	<xsl:template match="//tradition">
		<entries xsi:type="shr5:MagischeTradition">
			<xsl:choose>
				<xsl:when test="drain/text()='WIL + CHA'">
					<xsl:attribute name="enzug"><xsl:value-of
						select="'wil_cha'" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="drain/text()='WIL + LOG'">
					<xsl:attribute name="enzug"><xsl:value-of
						select="'wil_log'" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="drain/text()='WIL + INT'">
					<xsl:attribute name="enzug"><xsl:value-of
						select="'wil_int'" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>
			<xsl:attribute name="beschwoerbar">
					<xsl:for-each select="spirits">
					<xsl:call-template name="findSpirit">
						<xsl:with-param name="spiritname" select="spirit/text()" />
					</xsl:call-template>
					</xsl:for-each>
				</xsl:attribute>

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
				<entries xsi:type="shr5:SubstanceContainer">
					<xsl:attribute name="wertValue">
					<xsl:value-of select="0" />
			</xsl:attribute>
					<xsl:call-template name="beschreibbar" />
					<xsl:call-template name="quelle" />

					<xsl:call-template name="localization" />
					<substance xsi:type="shr5:Drug">
						<xsl:attribute name="proAnzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
						<xsl:attribute name="anzahl">
					<xsl:value-of select="10" />
					</xsl:attribute>
						<xsl:call-template name="gegenstand-basis" />
						<xsl:call-template name="localization" />
					</substance>
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
			<xsl:when test="category/text()='DocWagon Contract'">
				<entries xsi:type="shr5:IntervallVertrag" unit="year"
					faelligkeitsIntervall="1">
					<!-- <xsl:attribute name="programType"> -->
					<!-- <xsl:value-of select="category/text()" /> -->
					<!-- </xsl:attribute> -->
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

	<xsl:template match="//accessory">
		<!-- <xsl:if test="mount/text()!=''"> -->
		<entries xsi:type="shr5:FernkampfwaffeModifikator">
			<xsl:choose>
				<xsl:when test="mount/text()='Barrel'">
					<xsl:attribute name="ep"><xsl:value-of
						select="'Lauf'" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="mount/text()='Top'">
					<xsl:attribute name="ep"><xsl:value-of
						select="'Oben'" /></xsl:attribute>
				</xsl:when>
				<xsl:when test="mount/text()='Under'">
					<xsl:attribute name="ep"><xsl:value-of
						select="'Unten'" /></xsl:attribute>
				</xsl:when>
			</xsl:choose>

			<xsl:call-template name="set_parentid" />
			<xsl:call-template name="gegenstand-basis" />
			<xsl:call-template name="localization" />
		</entries>

		<!-- </xsl:if> -->
	</xsl:template>
	<xsl:template name="nahkamfwaffwe">
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
	</xsl:template>
	<xsl:template name="projectileweapon">
		<entries xsi:type="shr5:Projektilwaffe">
			<xsl:call-template name="gegenstand-basis" />

			<xsl:call-template name="setRange" />
			<xsl:call-template name="waffe" />
			<xsl:call-template name="localization" />
		</entries>
	</xsl:template>
	<xsl:template name="firearm">
		<entries xsi:type="shr5:Feuerwaffe">
			<xsl:call-template name="gegenstand-basis" />

			<xsl:call-template name="waffe" />
			<xsl:if test="category/text()='Light Pistols'
			or category/text()='Holdouts'
			or category/text()='Heavy Pistols' ">
				<xsl:attribute name="fertigkeit">
				<xsl:value-of select="$skill_pistols" />
				</xsl:attribute>
			</xsl:if>
			<xsl:if test="category/text()='Submachine Guns'
			or category/text()='Medium Machine Guns'
			or category/text()='Light Machine Guns'
			or category/text()='Machine Pistols' ">
				<xsl:attribute name="fertigkeit">
				<xsl:value-of select="$skill_automatics" />
				</xsl:attribute>
			</xsl:if>
			<xsl:if test="category/text()='Sporting Rifles' 
			or category/text()='Sniper Rifles' 
			or category/text()='Shotguns'">
				<xsl:attribute name="fertigkeit">
				<xsl:value-of select="$skill_longarms" />
				</xsl:attribute>
			</xsl:if>
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
				<xsl:attribute name="rueckstoss"><xsl:value-of select="number(rc/text())" /></xsl:attribute>
			</xsl:if>
			<xsl:call-template name="setRange" />

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
										<xsl:attribute name="ep"><xsl:value-of
											select="'Lauf'" /></xsl:attribute>
									</xsl:when>
									<xsl:when test="mount/text()='Top'">
										<xsl:attribute name="ep"><xsl:value-of
											select="'Oben'" /></xsl:attribute>
									</xsl:when>
									<xsl:when test="mount/text()='Under'">
										<xsl:attribute name="ep"><xsl:value-of
											select="'Unten'" /></xsl:attribute>
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
			<magazin>
				<xsl:attribute name="name"><xsl:value-of
					select="concat(name/text(),' ','ammunition')" /></xsl:attribute>
				<xsl:attribute name="type"><xsl:value-of select="id/text()" /></xsl:attribute>
				<xsl:call-template name="simple_quelle" />
			</magazin>
			<xsl:call-template name="localization" />
		</entries>
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
											<xsl:attribute name="ep"><xsl:value-of
												select="'Lauf'" /></xsl:attribute>
										</xsl:when>
										<xsl:when test="mount/text()='Top'">
											<xsl:attribute name="ep"><xsl:value-of
												select="'Oben'" /></xsl:attribute>
										</xsl:when>
										<xsl:when test="mount/text()='Under'">
											<xsl:attribute name="ep"><xsl:value-of
												select="'Unten'" /></xsl:attribute>
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
				<magazin>
					<xsl:attribute name="name"><xsl:value-of
						select="concat(name/text(),' ','ammunition')" /></xsl:attribute>
					<xsl:attribute name="type"><xsl:value-of
						select="id/text()" /></xsl:attribute>
					<xsl:call-template name="simple_quelle" />
				</magazin>
				<xsl:call-template name="localization" />
			</entries>
		</xsl:if>
	</xsl:template>
</xsl:stylesheet>