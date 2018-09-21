package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAnimal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zv";
		else
			return "net/minecraft/entity/passive/EntityAnimal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zv";
		else
			return "EntityAnimal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzv;";
		else
			return "Lnet/minecraft/entity/passive/EntityAnimal;";
	}

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityAnimal.func_70636_d");

	/**
	 * <p>
	 * Name: getLoveCause
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_191993_do = McMappingDatabase.getSRG("EntityAnimal.func_191993_do");

	/**
	 * <p>
	 * Name: getBlockPathWeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)F]
	 * </p>
	 */
	public static McObfPair func_180484_a = McMappingDatabase.getSRG("EntityAnimal.func_180484_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityAnimal.func_70103_a");

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityAnimal.func_70097_a");

	/**
	 * <p>
	 * Name: getTalkInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70627_aG = McMappingDatabase.getSRG("EntityAnimal.func_70627_aG");

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityAnimal.func_70692_ba");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("EntityAnimal.func_70033_W");

	/**
	 * <p>
	 * Name: consumeItemFromStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_175505_a = McMappingDatabase.getSRG("EntityAnimal.func_175505_a");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityAnimal.func_70693_a");

	/**
	 * <p>
	 * Name: resetInLove
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70875_t = McMappingDatabase.getSRG("EntityAnimal.func_70875_t");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityAnimal.func_70601_bi");

	/**
	 * <p>
	 * Name: spawnableBlock
	 * </p>
	 */
	public static McObfPair field_175506_bl = McMappingDatabase.getSRG("field_175506_bl");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("EntityAnimal.func_70878_b");

	/**
	 * <p>
	 * Name: inLove
	 * </p>
	 */
	public static McObfPair field_70881_d = McMappingDatabase.getSRG("field_70881_d");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityAnimal.func_70037_a");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityAnimal.func_70619_bc");

	/**
	 * <p>
	 * Name: isInLove
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70880_s = McMappingDatabase.getSRG("EntityAnimal.func_70880_s");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityAnimal.func_70014_b");

	/**
	 * <p>
	 * Name: setInLove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_146082_f = McMappingDatabase.getSRG("EntityAnimal.func_146082_f");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityAnimal.func_70877_b");

	/**
	 * <p>
	 * Name: playerInLove
	 * </p>
	 */
	public static McObfPair field_146084_br = McMappingDatabase.getSRG("field_146084_br");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityAnimal.func_184645_a");

}
