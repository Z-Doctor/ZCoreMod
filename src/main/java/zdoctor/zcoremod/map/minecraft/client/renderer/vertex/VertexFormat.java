package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VertexFormat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cea";
		else
			return "net/minecraft/client/renderer/vertex/VertexFormat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cea";
		else
			return "VertexFormat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcea;";
		else
			return "Lnet/minecraft/client/renderer/vertex/VertexFormat;";
	}

	/**
	 * <p>
	 * Name: getUvOffsetById
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_177344_b = McMappingDatabase.getSRG("VertexFormat.func_177344_b");

	/**
	 * <p>
	 * Name: getElementCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177345_h = McMappingDatabase.getSRG("VertexFormat.func_177345_h");

	/**
	 * <p>
	 * Name: nextOffset
	 * </p>
	 */
	public static McObfPair field_177353_d = McMappingDatabase.getSRG("field_177353_d");

	/**
	 * <p>
	 * Name: getNormalOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177342_c = McMappingDatabase.getSRG("VertexFormat.func_177342_c");

	/**
	 * <p>
	 * Name: offsets
	 * </p>
	 */
	public static McObfPair field_177356_c = McMappingDatabase.getSRG("field_177356_c");

	/**
	 * <p>
	 * Name: normalElementOffset
	 * </p>
	 */
	public static McObfPair field_177352_g = McMappingDatabase.getSRG("field_177352_g");

	/**
	 * <p>
	 * Name: colorElementOffset
	 * </p>
	 */
	public static McObfPair field_177354_e = McMappingDatabase.getSRG("field_177354_e");

	/**
	 * <p>
	 * Name: uvOffsetsById
	 * </p>
	 */
	public static McObfPair field_177351_f = McMappingDatabase.getSRG("field_177351_f");

	/**
	 * <p>
	 * Name: hasColor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177346_d = McMappingDatabase.getSRG("VertexFormat.func_177346_d");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_181720_d = McMappingDatabase.getSRG("VertexFormat.func_181720_d");

	/**
	 * <p>
	 * Name: getNextOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177338_f = McMappingDatabase.getSRG("VertexFormat.func_177338_f");

	/**
	 * <p>
	 * Name: getElements
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177343_g = McMappingDatabase.getSRG("VertexFormat.func_177343_g");

	/**
	 * <p>
	 * Name: hasNormal
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177350_b = McMappingDatabase.getSRG("VertexFormat.func_177350_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_177357_a = McMappingDatabase.getSRG("field_177357_a");

	/**
	 * <p>
	 * Name: addElement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/vertex/VertexFormatElement;)Lnet/minecraft/client/renderer/vertex/VertexFormat;]
	 * </p>
	 */
	public static McObfPair func_181721_a = McMappingDatabase.getSRG("VertexFormat.func_181721_a");

	/**
	 * <p>
	 * Name: getElement
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/renderer/vertex/VertexFormatElement;]
	 * </p>
	 */
	public static McObfPair func_177348_c = McMappingDatabase.getSRG("VertexFormat.func_177348_c");

	/**
	 * <p>
	 * Name: elements
	 * </p>
	 */
	public static McObfPair field_177355_b = McMappingDatabase.getSRG("field_177355_b");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177339_a = McMappingDatabase.getSRG("VertexFormat.func_177339_a");

	/**
	 * <p>
	 * Name: hasUvOffset
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_177347_a = McMappingDatabase.getSRG("VertexFormat.func_177347_a");

	/**
	 * <p>
	 * Name: hasPosition
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177341_i = McMappingDatabase.getSRG("VertexFormat.func_177341_i");

	/**
	 * <p>
	 * Name: getIntegerSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_181719_f = McMappingDatabase.getSRG("VertexFormat.func_181719_f");

	/**
	 * <p>
	 * Name: getColorOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177340_e = McMappingDatabase.getSRG("VertexFormat.func_177340_e");

}
