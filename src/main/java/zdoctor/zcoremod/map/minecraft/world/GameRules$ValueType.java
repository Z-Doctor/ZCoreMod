package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameRules$ValueType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr$b";
		else
			return "net/minecraft/world/GameRules$ValueType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr$b";
		else
			return "GameRules$ValueType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamr$b;";
		else
			return "Lnet/minecraft/world/GameRules$ValueType;";
	}

}
