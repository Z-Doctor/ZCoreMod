package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFlowerPot$EnumFlowerType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqs$a";
		else
			return "net/minecraft/block/BlockFlowerPot$EnumFlowerType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqs$a";
		else
			return "BlockFlowerPot$EnumFlowerType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqs$a;";
		else
			return "Lnet/minecraft/block/BlockFlowerPot$EnumFlowerType;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockFlowerPot$EnumFlowerType.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177006_w = McMappingDatabase.getSRG("field_177006_w");

}
