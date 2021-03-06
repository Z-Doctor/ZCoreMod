package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ImpossibleTrigger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ak";
		else
			return "net/minecraft/advancements/critereon/ImpossibleTrigger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ak";
		else
			return "ImpossibleTrigger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lak;";
		else
			return "Lnet/minecraft/advancements/critereon/ImpossibleTrigger;";
	}

	/**
	 * <p>
	 * Name: ID
	 * </p>
	 */
	public static McObfPair field_192205_a = McMappingDatabase.getSRG("field_192205_a");

	/**
	 * <p>
	 * Name: removeAllListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192167_a = McMappingDatabase.getSRG("ImpossibleTrigger.func_192167_a");

	/**
	 * <p>
	 * Name: deserializeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/ICriterionInstance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/critereon/ImpossibleTrigger$Instance;]
	 * </p>
	 */
	public static McObfPair func_192166_a = McMappingDatabase.getSRG("ImpossibleTrigger.func_192166_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192164_b = McMappingDatabase.getSRG("ImpossibleTrigger.func_192164_b");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192165_a = McMappingDatabase.getSRG("ImpossibleTrigger.func_192165_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192163_a = McMappingDatabase.getSRG("ImpossibleTrigger.func_192163_a");

}
