package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChangeDimensionTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "x$a";
		else
			return "net/minecraft/advancements/critereon/ChangeDimensionTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "x$a";
		else
			return "ChangeDimensionTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lx$a;";
		else
			return "Lnet/minecraft/advancements/critereon/ChangeDimensionTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193236_b = McMappingDatabase.getSRG("field_193236_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193232_a = McMappingDatabase.getSRG("ChangeDimensionTrigger$Listeners.func_193232_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193233_a = McMappingDatabase.getSRG("ChangeDimensionTrigger$Listeners.func_193233_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DimensionType;Lnet/minecraft/world/DimensionType;)V]
	 * </p>
	 */
	public static McObfPair func_193234_a = McMappingDatabase.getSRG("ChangeDimensionTrigger$Listeners.func_193234_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193231_b = McMappingDatabase.getSRG("ChangeDimensionTrigger$Listeners.func_193231_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_193235_a = McMappingDatabase.getSRG("field_193235_a");

}
