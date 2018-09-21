package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ImpossibleTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ak$a";
		else
			return "net/minecraft/advancements/critereon/ImpossibleTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ak$a";
		else
			return "ImpossibleTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lak$a;";
		else
			return "Lnet/minecraft/advancements/critereon/ImpossibleTrigger$Instance;";
	}

}
