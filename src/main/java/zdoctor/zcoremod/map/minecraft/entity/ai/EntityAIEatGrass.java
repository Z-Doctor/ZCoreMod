package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIEatGrass {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wx";
		else
			return "net/minecraft/entity/ai/EntityAIEatGrass";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wx";
		else
			return "EntityAIEatGrass";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwx;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIEatGrass;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIEatGrass.func_75246_d");

	/**
	 * <p>
	 * Name: IS_TALL_GRASS
	 * </p>
	 */
	public static McObfPair field_179505_b = McMappingDatabase.getSRG("field_179505_b");

	/**
	 * <p>
	 * Name: getEatingGrassTimer
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151499_f = McMappingDatabase.getSRG("EntityAIEatGrass.func_151499_f");

	/**
	 * <p>
	 * Name: grassEaterEntity
	 * </p>
	 */
	public static McObfPair field_151500_b = McMappingDatabase.getSRG("field_151500_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIEatGrass.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAIEatGrass.func_75250_a");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIEatGrass.func_75251_c");

	/**
	 * <p>
	 * Name: eatingGrassTimer
	 * </p>
	 */
	public static McObfPair field_151502_a = McMappingDatabase.getSRG("field_151502_a");

	/**
	 * <p>
	 * Name: entityWorld
	 * </p>
	 */
	public static McObfPair field_151501_c = McMappingDatabase.getSRG("field_151501_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityAIEatGrass.func_75253_b");

}
