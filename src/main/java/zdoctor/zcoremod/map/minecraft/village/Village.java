package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Village {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zo";
		else
			return "net/minecraft/village/Village";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zo";
		else
			return "Village";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzo;";
		else
			return "Lnet/minecraft/village/Village;";
	}

	/**
	 * <p>
	 * Name: villageAgressors
	 * </p>
	 */
	public static McObfPair field_75589_i = McMappingDatabase.getSRG("field_75589_i");

	/**
	 * <p>
	 * Name: removeDeadAndOutOfRangeDoors
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75557_k = McMappingDatabase.getSRG("Village.func_75557_k");

	/**
	 * <p>
	 * Name: getCenter
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180608_a = McMappingDatabase.getSRG("Village.func_180608_a");

	/**
	 * <p>
	 * Name: centerHelper
	 * </p>
	 */
	public static McObfPair field_75585_c = McMappingDatabase.getSRG("field_75585_c");

	/**
	 * <p>
	 * Name: getNearestDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/village/VillageDoorInfo;]
	 * </p>
	 */
	public static McObfPair func_179865_b = McMappingDatabase.getSRG("Village.func_179865_b");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_75586_a = McMappingDatabase.getSRG("field_75586_a");

	/**
	 * <p>
	 * Name: tickCounter
	 * </p>
	 */
	public static McObfPair field_75581_g = McMappingDatabase.getSRG("field_75581_g");

	/**
	 * <p>
	 * Name: addVillageDoorInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/VillageDoorInfo;)V]
	 * </p>
	 */
	public static McObfPair func_75576_a = McMappingDatabase.getSRG("Village.func_75576_a");

	/**
	 * <p>
	 * Name: removeDeadAndOldAgressors
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75565_j = McMappingDatabase.getSRG("Village.func_75565_j");

	/**
	 * <p>
	 * Name: isAreaClearAround
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179861_a = McMappingDatabase.getSRG("Village.func_179861_a");

	/**
	 * <p>
	 * Name: endMatingSeason
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82692_h = McMappingDatabase.getSRG("Village.func_82692_h");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_82691_a = McMappingDatabase.getSRG("Village.func_82691_a");

	/**
	 * <p>
	 * Name: getVillageDoorInfoList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75558_f = McMappingDatabase.getSRG("Village.func_75558_f");

	/**
	 * <p>
	 * Name: noBreedTicks
	 * </p>
	 */
	public static McObfPair field_82694_i = McMappingDatabase.getSRG("field_82694_i");

	/**
	 * <p>
	 * Name: playerReputation
	 * </p>
	 */
	public static McObfPair field_82693_j = McMappingDatabase.getSRG("field_82693_j");

	/**
	 * <p>
	 * Name: addOrRenewAgressor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_75575_a = McMappingDatabase.getSRG("Village.func_75575_a");

	/**
	 * <p>
	 * Name: getPlayerReputation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_82684_a = McMappingDatabase.getSRG("Village.func_82684_a");

	/**
	 * <p>
	 * Name: isPlayerReputationTooLow
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_82687_d = McMappingDatabase.getSRG("Village.func_82687_d");

	/**
	 * <p>
	 * Name: getTicksSinceLastDoorAdding
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75561_d = McMappingDatabase.getSRG("Village.func_75561_d");

	/**
	 * <p>
	 * Name: updateNumIronGolems
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75579_h = McMappingDatabase.getSRG("Village.func_75579_h");

	/**
	 * <p>
	 * Name: updateNumVillagers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75572_i = McMappingDatabase.getSRG("Village.func_75572_i");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_75560_a = McMappingDatabase.getSRG("Village.func_75560_a");

	/**
	 * <p>
	 * Name: villageDoorInfoList
	 * </p>
	 */
	public static McObfPair field_75584_b = McMappingDatabase.getSRG("field_75584_b");

	/**
	 * <p>
	 * Name: getVillageRadius
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75568_b = McMappingDatabase.getSRG("Village.func_75568_b");

	/**
	 * <p>
	 * Name: isMatingSeason
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82686_i = McMappingDatabase.getSRG("Village.func_82686_i");

	/**
	 * <p>
	 * Name: getExistedDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/village/VillageDoorInfo;]
	 * </p>
	 */
	public static McObfPair func_179864_e = McMappingDatabase.getSRG("Village.func_179864_e");

	/**
	 * <p>
	 * Name: numVillagers
	 * </p>
	 */
	public static McObfPair field_75588_h = McMappingDatabase.getSRG("field_75588_h");

	/**
	 * <p>
	 * Name: center
	 * </p>
	 */
	public static McObfPair field_75582_d = McMappingDatabase.getSRG("field_75582_d");

	/**
	 * <p>
	 * Name: writeVillageDataToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_82689_b = McMappingDatabase.getSRG("Village.func_82689_b");

	/**
	 * <p>
	 * Name: getNearestTargetPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_82685_c = McMappingDatabase.getSRG("Village.func_82685_c");

	/**
	 * <p>
	 * Name: getNumVillagers
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75562_e = McMappingDatabase.getSRG("Village.func_75562_e");

	/**
	 * <p>
	 * Name: getDoorInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/village/VillageDoorInfo;]
	 * </p>
	 */
	public static McObfPair func_179863_c = McMappingDatabase.getSRG("Village.func_179863_c");

	/**
	 * <p>
	 * Name: villageRadius
	 * </p>
	 */
	public static McObfPair field_75583_e = McMappingDatabase.getSRG("field_75583_e");

	/**
	 * <p>
	 * Name: modifyPlayerReputation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_82688_a = McMappingDatabase.getSRG("Village.func_82688_a");

	/**
	 * <p>
	 * Name: lastAddDoorTimestamp
	 * </p>
	 */
	public static McObfPair field_75580_f = McMappingDatabase.getSRG("field_75580_f");

	/**
	 * <p>
	 * Name: isAnnihilated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75566_g = McMappingDatabase.getSRG("Village.func_75566_g");

	/**
	 * <p>
	 * Name: findRandomSpawnPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;III)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_179862_a = McMappingDatabase.getSRG("Village.func_179862_a");

	/**
	 * <p>
	 * Name: numIronGolems
	 * </p>
	 */
	public static McObfPair field_75587_j = McMappingDatabase.getSRG("field_75587_j");

	/**
	 * <p>
	 * Name: isWoodDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179860_f = McMappingDatabase.getSRG("Village.func_179860_f");

	/**
	 * <p>
	 * Name: isBlockPosWithinSqVillageRadius
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_179866_a = McMappingDatabase.getSRG("Village.func_179866_a");

	/**
	 * <p>
	 * Name: updateVillageRadiusAndCenter
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75573_l = McMappingDatabase.getSRG("Village.func_75573_l");

	/**
	 * <p>
	 * Name: getNumVillageDoors
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_75567_c = McMappingDatabase.getSRG("Village.func_75567_c");

	/**
	 * <p>
	 * Name: readVillageDataFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_82690_a = McMappingDatabase.getSRG("Village.func_82690_a");

	/**
	 * <p>
	 * Name: findNearestVillageAggressor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_75571_b = McMappingDatabase.getSRG("Village.func_75571_b");

	/**
	 * <p>
	 * Name: setDefaultPlayerReputation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82683_b = McMappingDatabase.getSRG("Village.func_82683_b");

}
