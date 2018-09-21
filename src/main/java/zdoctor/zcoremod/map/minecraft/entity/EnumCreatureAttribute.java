package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumCreatureAttribute {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vu";
		else
			return "net/minecraft/entity/EnumCreatureAttribute";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vu";
		else
			return "EnumCreatureAttribute";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvu;";
		else
			return "Lnet/minecraft/entity/EnumCreatureAttribute;";
	}

}
