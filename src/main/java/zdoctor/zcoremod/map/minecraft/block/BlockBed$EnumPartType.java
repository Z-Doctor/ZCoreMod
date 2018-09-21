package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockBed$EnumPartType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aou$a";
		else
			return "net/minecraft/block/BlockBed$EnumPartType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aou$a";
		else
			return "BlockBed$EnumPartType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laou$a;";
		else
			return "Lnet/minecraft/block/BlockBed$EnumPartType;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177036_c = McMappingDatabase.getSRG("field_177036_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockBed$EnumPartType.func_176610_l");

}
