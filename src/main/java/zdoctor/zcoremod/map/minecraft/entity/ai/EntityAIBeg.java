package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIBeg {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wt";
		else
			return "net/minecraft/entity/ai/EntityAIBeg";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wt";
		else
			return "EntityAIBeg";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwt;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIBeg;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIBeg.func_75253_b");

	/**
	 * <p>
	 * Name: minPlayerDistance
	 * </p>
	 */
	public static McObfPair field_75383_d = McMappingDatabase.getSRG("field_75383_d");

	/**
	 * <p>
	 * Name: hasTemptationItemInHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_75382_a = McMappingDatabase.getSRG("EntityAIBeg.func_75382_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIBeg.func_75250_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIBeg.func_75249_e");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75386_c = McMappingDatabase.getSRG("field_75386_c");

	/**
	 * <p>
	 * Name: wolf
	 * </p>
	 */
	public static McObfPair field_75387_a = McMappingDatabase.getSRG("field_75387_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIBeg.func_75251_c");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIBeg.func_75246_d");

	/**
	 * <p>
	 * Name: timeoutCounter
	 * </p>
	 */
	public static McObfPair field_75384_e = McMappingDatabase.getSRG("field_75384_e");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_75385_b = McMappingDatabase.getSRG("field_75385_b");

}
