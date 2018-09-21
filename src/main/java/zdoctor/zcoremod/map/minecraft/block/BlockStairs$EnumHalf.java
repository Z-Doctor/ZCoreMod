package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStairs$EnumHalf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud$a";
		else
			return "net/minecraft/block/BlockStairs$EnumHalf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aud$a";
		else
			return "BlockStairs$EnumHalf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laud$a;";
		else
			return "Lnet/minecraft/block/BlockStairs$EnumHalf;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176709_c = McMappingDatabase.getSRG("field_176709_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStairs$EnumHalf.func_176610_l");

}
