package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFlower$EnumFlowerType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$a";
		else
			return "net/minecraft/block/BlockFlower$EnumFlowerType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$a";
		else
			return "BlockFlower$EnumFlowerType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqr$a;";
		else
			return "Lnet/minecraft/block/BlockFlower$EnumFlowerType;";
	}

	/**
	 * <p>
	 * Name: getMeta
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176968_b = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176968_b");

	/**
	 * <p>
	 * Name: TYPES_FOR_BLOCK
	 * </p>
	 */
	public static McObfPair field_176981_k = McMappingDatabase.getSRG("field_176981_k");

	/**
	 * <p>
	 * Name: blockType
	 * </p>
	 */
	public static McObfPair field_176978_l = McMappingDatabase.getSRG("field_176978_l");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176979_m = McMappingDatabase.getSRG("field_176979_m");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176963_d = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176963_d");

	/**
	 * <p>
	 * Name: getTypes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockFlower$EnumFlowerColor;)[Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_176966_a = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176966_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176976_n = McMappingDatabase.getSRG("field_176976_n");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176977_o = McMappingDatabase.getSRG("field_176977_o");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176610_l");

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockFlower$EnumFlowerColor;]
	 * </p>
	 */
	public static McObfPair func_176964_a = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176964_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockFlower$EnumFlowerColor;I)Lnet/minecraft/block/BlockFlower$EnumFlowerType;]
	 * </p>
	 */
	public static McObfPair func_176967_a = McMappingDatabase.getSRG("BlockFlower$EnumFlowerType.func_176967_a");

}
