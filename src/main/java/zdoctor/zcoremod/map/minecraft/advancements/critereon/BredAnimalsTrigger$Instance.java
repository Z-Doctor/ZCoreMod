package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BredAnimalsTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "v$b";
		else
			return "net/minecraft/advancements/critereon/BredAnimalsTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "v$b";
		else
			return "BredAnimalsTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lv$b;";
		else
			return "Lnet/minecraft/advancements/critereon/BredAnimalsTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_192247_a = McMappingDatabase.getSRG("field_192247_a");

	/**
	 * <p>
	 * Name: partner
	 * </p>
	 */
	public static McObfPair field_192248_b = McMappingDatabase.getSRG("field_192248_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/EntityAgeable;)Z]
	 * </p>
	 */
	public static McObfPair func_192246_a = McMappingDatabase.getSRG("BredAnimalsTrigger$Instance.func_192246_a");

	/**
	 * <p>
	 * Name: child
	 * </p>
	 */
	public static McObfPair field_192249_c = McMappingDatabase.getSRG("field_192249_c");

}
