package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerHurtEntityTrigger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax";
		else
			return "net/minecraft/advancements/critereon/PlayerHurtEntityTrigger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax";
		else
			return "PlayerHurtEntityTrigger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lax;";
		else
			return "Lnet/minecraft/advancements/critereon/PlayerHurtEntityTrigger;";
	}

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192223_b = McMappingDatabase.getSRG("field_192223_b");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192165_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192165_a");

	/**
	 * <p>
	 * Name: ID
	 * </p>
	 */
	public static McObfPair field_192222_a = McMappingDatabase.getSRG("field_192222_a");

	/**
	 * <p>
	 * Name: removeAllListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192167_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192167_a");

	/**
	 * <p>
	 * Name: deserializeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/ICriterionInstance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/critereon/PlayerHurtEntityTrigger$Instance;]
	 * </p>
	 */
	public static McObfPair func_192166_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192166_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/DamageSource;FFZ)V]
	 * </p>
	 */
	public static McObfPair func_192220_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192220_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192164_b = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192164_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192163_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger.func_192163_a");

}
