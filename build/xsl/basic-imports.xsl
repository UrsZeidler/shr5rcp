<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:shr5="http://urszeidler.de/shr5/1.0"
	xmlns:shr5mngt="http://urszeidler.de/shr5mngt/1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
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
<!-- 	<xsl:variable name="shr5CharacterBuilder" -->
<!-- 		select="document('/home/urs/etc/chummer_custom/Metavariant_only_priorities.xml')" /> -->
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
	<xsl:variable name="martialarts"
		select="document(concat($path,'/martialarts.xml'),/)" />
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
	
	
	</xsl:stylesheet>