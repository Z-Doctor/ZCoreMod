package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSilverfish$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a";
		else
			return "net/minecraft/block/BlockSilverfish$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a";
		else
			return "BlockSilverfish$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasa$a;";
		else
			return "Lnet/minecraft/block/BlockSilverfish$EnumType;";
	}

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockSilverfish$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176879_a = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176879_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176894_i = McMappingDatabase.getSRG("field_176894_i");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176893_h = McMappingDatabase.getSRG("field_176893_h");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176882_c = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176882_c");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176891_j = McMappingDatabase.getSRG("field_176891_j");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176881_a = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176881_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176885_g = McMappingDatabase.getSRG("field_176885_g");

	/**
	 * <p>
	 * Name: getModelBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176883_d = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176883_d");

	/**
	 * <p>
	 * Name: forModelBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/BlockSilverfish$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176878_a = McMappingDatabase.getSRG("BlockSilverfish$EnumType.func_176878_a");

}
