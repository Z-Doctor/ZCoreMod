package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFlower$EnumFlowerType$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$a$1";
		else
			return "net/minecraft/block/BlockFlower$EnumFlowerType$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$a$1";
		else
			return "BlockFlower$EnumFlowerType$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqr$a$1;";
		else
			return "Lnet/minecraft/block/BlockFlower$EnumFlowerType$1;";
	}

}
