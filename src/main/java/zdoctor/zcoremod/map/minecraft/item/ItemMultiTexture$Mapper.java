package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMultiTexture$Mapper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiz$a";
		else
			return "net/minecraft/item/ItemMultiTexture$Mapper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aiz$a";
		else
			return "ItemMultiTexture$Mapper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laiz$a;";
		else
			return "Lnet/minecraft/item/ItemMultiTexture$Mapper;";
	}

}
