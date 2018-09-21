package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FrameType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "s";
		else
			return "net/minecraft/advancements/FrameType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "s";
		else
			return "FrameType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ls;";
		else
			return "Lnet/minecraft/advancements/FrameType;";
	}

	/**
	 * <p>
	 * Name: format
	 * </p>
	 */
	public static McObfPair field_193230_f = McMappingDatabase.getSRG("field_193230_f");

	/**
	 * <p>
	 * Name: getFormat
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/TextFormatting;]
	 * </p>
	 */
	public static McObfPair func_193229_c = McMappingDatabase.getSRG("FrameType.func_193229_c");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/advancements/FrameType;]
	 * </p>
	 */
	public static McObfPair func_192308_a = McMappingDatabase.getSRG("FrameType.func_192308_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_192307_a = McMappingDatabase.getSRG("FrameType.func_192307_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_192313_d = McMappingDatabase.getSRG("field_192313_d");

	/**
	 * <p>
	 * Name: getIcon
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192309_b = McMappingDatabase.getSRG("FrameType.func_192309_b");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_192314_e = McMappingDatabase.getSRG("field_192314_e");

}
