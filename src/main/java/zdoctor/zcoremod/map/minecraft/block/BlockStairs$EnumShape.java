package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStairs$EnumShape {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud$b";
		else
			return "net/minecraft/block/BlockStairs$EnumShape";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud$b";
		else
			return "BlockStairs$EnumShape";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laud$b;";
		else
			return "Lnet/minecraft/block/BlockStairs$EnumShape;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStairs$EnumShape.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176699_f = McMappingDatabase.getSRG("field_176699_f");

}
