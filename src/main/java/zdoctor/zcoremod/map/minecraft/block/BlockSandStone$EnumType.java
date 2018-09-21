package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSandStone$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ato$a";
		else
			return "net/minecraft/block/BlockSandStone$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ato$a";
		else
			return "BlockSandStone$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lato$a;";
		else
			return "Lnet/minecraft/block/BlockSandStone$EnumType;";
	}

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176678_g = McMappingDatabase.getSRG("field_176678_g");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockSandStone$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176675_a = McMappingDatabase.getSRG("BlockSandStone$EnumType.func_176675_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176679_d = McMappingDatabase.getSRG("field_176679_d");

	/**
	 * <p>
	 * Name: metadata
	 * </p>
	 */
	public static McObfPair field_176680_e = McMappingDatabase.getSRG("field_176680_e");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176676_c = McMappingDatabase.getSRG("BlockSandStone$EnumType.func_176676_c");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockSandStone$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176673_a = McMappingDatabase.getSRG("BlockSandStone$EnumType.func_176673_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176677_f = McMappingDatabase.getSRG("field_176677_f");

}
