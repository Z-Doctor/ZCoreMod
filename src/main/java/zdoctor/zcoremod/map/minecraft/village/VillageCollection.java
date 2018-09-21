package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillageCollection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zq";
		else
			return "net/minecraft/village/VillageCollection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zq";
		else
			return "VillageCollection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzq;";
		else
			return "Lnet/minecraft/village/VillageCollection;";
	}

	/**
	 * <p>
	 * Name: addToNewDoorsList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176059_d = McMappingDatabase.getSRG("VillageCollection.func_176059_d");

	/**
	 * <p>
	 * Name: villageList
	 * </p>
	 */
	public static McObfPair field_75552_d = McMappingDatabase.getSRG("field_75552_d");

	/**
	 * <p>
	 * Name: dropOldestVillagerPosition
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75543_d = McMappingDatabase.getSRG("VillageCollection.func_75543_d");

	/**
	 * <p>
	 * Name: setWorldsForAll
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_82566_a = McMappingDatabase.getSRG("VillageCollection.func_82566_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75556_a = McMappingDatabase.getSRG("field_75556_a");

	/**
	 * <p>
	 * Name: addNewDoorsToVillageOrCreateVillage
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75545_e = McMappingDatabase.getSRG("VillageCollection.func_75545_e");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76184_a = McMappingDatabase.getSRG("VillageCollection.func_76184_a");

	/**
	 * <p>
	 * Name: newDoors
	 * </p>
	 */
	public static McObfPair field_75555_c = McMappingDatabase.getSRG("field_75555_c");

	/**
	 * <p>
	 * Name: isWoodDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176058_f = McMappingDatabase.getSRG("VillageCollection.func_176058_f");

	/**
	 * <p>
	 * Name: addToVillagerPositionList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176060_a = McMappingDatabase.getSRG("VillageCollection.func_176060_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189551_b = McMappingDatabase.getSRG("VillageCollection.func_189551_b");

	/**
	 * <p>
	 * Name: tickCounter
	 * </p>
	 */
	public static McObfPair field_75553_e = McMappingDatabase.getSRG("field_75553_e");

	/**
	 * <p>
	 * Name: positionInList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_176057_e = McMappingDatabase.getSRG("VillageCollection.func_176057_e");

	/**
	 * <p>
	 * Name: removeAnnihilatedVillages
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75549_c = McMappingDatabase.getSRG("VillageCollection.func_75549_c");

	/**
	 * <p>
	 * Name: villagerPositionsList
	 * </p>
	 */
	public static McObfPair field_75554_b = McMappingDatabase.getSRG("field_75554_b");

	/**
	 * <p>
	 * Name: fileNameForProvider
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldProvider;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176062_a = McMappingDatabase.getSRG("VillageCollection.func_176062_a");

	/**
	 * <p>
	 * Name: checkDoorExistence
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/village/VillageDoorInfo;]
	 * </p>
	 */
	public static McObfPair func_176055_c = McMappingDatabase.getSRG("VillageCollection.func_176055_c");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75544_a = McMappingDatabase.getSRG("VillageCollection.func_75544_a");

	/**
	 * <p>
	 * Name: countBlocksCanSeeSky
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;I)I]
	 * </p>
	 */
	public static McObfPair func_176061_a = McMappingDatabase.getSRG("VillageCollection.func_176061_a");

	/**
	 * <p>
	 * Name: getVillageList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75540_b = McMappingDatabase.getSRG("VillageCollection.func_75540_b");

	/**
	 * <p>
	 * Name: getNearestVillage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)Lnet/minecraft/village/Village;]
	 * </p>
	 */
	public static McObfPair func_176056_a = McMappingDatabase.getSRG("VillageCollection.func_176056_a");

	/**
	 * <p>
	 * Name: addDoorsAround
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180609_b = McMappingDatabase.getSRG("VillageCollection.func_180609_b");

}
