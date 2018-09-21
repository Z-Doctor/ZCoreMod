package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TameAnimalTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ba$b";
		else
			return "net/minecraft/advancements/critereon/TameAnimalTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ba$b";
		else
			return "TameAnimalTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lba$b;";
		else
			return "Lnet/minecraft/advancements/critereon/TameAnimalTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_193217_a = McMappingDatabase.getSRG("field_193217_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_193216_a = McMappingDatabase.getSRG("TameAnimalTrigger$Instance.func_193216_a");

}
