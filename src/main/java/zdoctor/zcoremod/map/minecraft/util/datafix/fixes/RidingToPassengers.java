package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RidingToPassengers {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sr";
		else
			return "net/minecraft/util/datafix/fixes/RidingToPassengers";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sr";
		else
			return "RidingToPassengers";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsr;";
		else
			return "Lnet/minecraft/util/datafix/fixes/RidingToPassengers;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("RidingToPassengers.func_188217_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("RidingToPassengers.func_188216_a");

	/**
	 * <p>
	 * Name: extractVehicle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188220_b = McMappingDatabase.getSRG("RidingToPassengers.func_188220_b");

	/**
	 * <p>
	 * Name: addPassengerToVehicle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_188219_a = McMappingDatabase.getSRG("RidingToPassengers.func_188219_a");

}
