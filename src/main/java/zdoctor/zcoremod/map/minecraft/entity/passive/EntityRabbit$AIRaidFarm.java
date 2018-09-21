package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$AIRaidFarm {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$g";
		else
			return "net/minecraft/entity/passive/EntityRabbit$AIRaidFarm";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$g";
		else
			return "EntityRabbit$AIRaidFarm";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$g;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$AIRaidFarm;";
	}

	/**
	 * <p>
	 * Name: wantsToRaid
	 * </p>
	 */
	public static McObfPair field_179498_d = McMappingDatabase.getSRG("field_179498_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityRabbit$AIRaidFarm.func_75250_a");

	/**
	 * <p>
	 * Name: canRaid
	 * </p>
	 */
	public static McObfPair field_179499_e = McMappingDatabase.getSRG("field_179499_e");

	/**
	 * <p>
	 * Name: shouldMoveTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179488_a = McMappingDatabase.getSRG("EntityRabbit$AIRaidFarm.func_179488_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityRabbit$AIRaidFarm.func_75246_d");

	/**
	 * <p>
	 * Name: rabbit
	 * </p>
	 */
	public static McObfPair field_179500_c = McMappingDatabase.getSRG("field_179500_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityRabbit$AIRaidFarm.func_75253_b");

}
