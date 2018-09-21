package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpellcasterIllager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm";
		else
			return "net/minecraft/entity/monster/EntitySpellcasterIllager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm";
		else
			return "EntitySpellcasterIllager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladm;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpellcasterIllager;";
	}

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_70619_bc");

	/**
	 * <p>
	 * Name: setSpellType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;)V]
	 * </p>
	 */
	public static McObfPair func_193081_a = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193081_a");

	/**
	 * <p>
	 * Name: getSpellSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_193086_dk = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193086_dk");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_70014_b");

	/**
	 * <p>
	 * Name: getArmPose
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/AbstractIllager$IllagerArmPose;]
	 * </p>
	 */
	public static McObfPair func_193077_p = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193077_p");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_70037_a");

	/**
	 * <p>
	 * Name: getSpellTicks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193085_dn = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193085_dn");

	/**
	 * <p>
	 * Name: spellTicks
	 * </p>
	 */
	public static McObfPair field_193087_b = McMappingDatabase.getSRG("field_193087_b");

	/**
	 * <p>
	 * Name: isSpellcasting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193082_dl = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193082_dl");

	/**
	 * <p>
	 * Name: SPELL
	 * </p>
	 */
	public static McObfPair field_193088_c = McMappingDatabase.getSRG("field_193088_c");

	/**
	 * <p>
	 * Name: activeSpell
	 * </p>
	 */
	public static McObfPair field_193089_bx = McMappingDatabase.getSRG("field_193089_bx");

	/**
	 * <p>
	 * Name: getSpellType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193083_dm = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_193083_dm");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_70071_h_");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntitySpellcasterIllager.func_70088_a");

}
