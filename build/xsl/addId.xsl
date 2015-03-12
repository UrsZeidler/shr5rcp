<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:uuid="java.util.UUID"
	exclude-result-prefixes="uuid">
	<xsl:output indent="yes" />

	<xsl:template match="quality|metatype|tradition|spell|power">
		<xsl:copy>
			<xsl:if test="*">
				<id>
					<xsl:value-of select="uuid:randomUUID()" />
				</id>
			</xsl:if>
			<xsl:apply-templates />
		</xsl:copy>
	</xsl:template>


	<!--IDENTITY TRANSFORM -->
	<xsl:template match="node()|@*">
		<xsl:copy>
			<xsl:apply-templates select="node()|@*" />
		</xsl:copy>
	</xsl:template>

</xsl:stylesheet>