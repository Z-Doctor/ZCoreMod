package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPressurePlate$Sensitivity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asw$a";
		else
			return "net/minecraft/block/BlockPressurePlate$Sensitivity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asw$a";
		else
			return "BlockPressurePlate$Sensitivity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasw$a;";
		else
			return "Lnet/minecraft/block/BlockPressurePlate$Sensitivity;";
	}

}
