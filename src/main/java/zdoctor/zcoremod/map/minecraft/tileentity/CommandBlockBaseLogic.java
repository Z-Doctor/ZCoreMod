package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandBlockBaseLogic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amj";
		else
			return "net/minecraft/tileentity/CommandBlockBaseLogic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amj";
		else
			return "CommandBlockBaseLogic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamj;";
		else
			return "Lnet/minecraft/tileentity/CommandBlockBaseLogic;";
	}

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145754_b = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145754_b");

	/**
	 * <p>
	 * Name: getLastOutput
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145749_h = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145749_h");

	/**
	 * <p>
	 * Name: resultStats
	 * </p>
	 */
	public static McObfPair field_175575_g = McMappingDatabase.getSRG("field_175575_g");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_70003_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_145755_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145755_a");

	/**
	 * <p>
	 * Name: setTrackOutput
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175573_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_175573_a");

	/**
	 * <p>
	 * Name: shouldTrackOutput
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175571_m = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_175571_m");

	/**
	 * <p>
	 * Name: setLastOutput
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145750_b = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145750_b");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145747_a");

	/**
	 * <p>
	 * Name: updateCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145756_e = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145756_e");

	/**
	 * <p>
	 * Name: trackOutput
	 * </p>
	 */
	public static McObfPair field_145765_c = McMappingDatabase.getSRG("field_145765_c");

	/**
	 * <p>
	 * Name: commandStored
	 * </p>
	 */
	public static McObfPair field_145763_e = McMappingDatabase.getSRG("field_145763_e");

	/**
	 * <p>
	 * Name: tryOpenEditCommandBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_175574_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_175574_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189510_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_189510_a");

	/**
	 * <p>
	 * Name: lastOutput
	 * </p>
	 */
	public static McObfPair field_145762_d = McMappingDatabase.getSRG("field_145762_d");

	/**
	 * <p>
	 * Name: getCommand
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_145753_i = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145753_i");

	/**
	 * <p>
	 * Name: setSuccessCount
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184167_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_184167_a");

	/**
	 * <p>
	 * Name: setCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145752_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145752_a");

	/**
	 * <p>
	 * Name: getCommandResultStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandResultStats;]
	 * </p>
	 */
	public static McObfPair func_175572_n = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_175572_n");

	/**
	 * <p>
	 * Name: getSuccessCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145760_g = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145760_g");

	/**
	 * <p>
	 * Name: TIMESTAMP_FORMAT
	 * </p>
	 */
	public static McObfPair field_145766_a = McMappingDatabase.getSRG("field_145766_a");

	/**
	 * <p>
	 * Name: readDataFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145759_b = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145759_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_70005_c_");

	/**
	 * <p>
	 * Name: fillInInfo
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_145757_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145757_a");

	/**
	 * <p>
	 * Name: successCount
	 * </p>
	 */
	public static McObfPair field_145764_b = McMappingDatabase.getSRG("field_145764_b");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_174792_t_");

	/**
	 * <p>
	 * Name: setCommandStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats$Type;I)V]
	 * </p>
	 */
	public static McObfPair func_174794_a = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_174794_a");

	/**
	 * <p>
	 * Name: getCommandBlockType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145751_f = McMappingDatabase.getSRG("CommandBlockBaseLogic.func_145751_f");

	/**
	 * <p>
	 * Name: lastExecution
	 * </p>
	 */
	public static McObfPair field_193041_b = McMappingDatabase.getSRG("field_193041_b");

	/**
	 * <p>
	 * Name: customName
	 * </p>
	 */
	public static McObfPair field_145761_f = McMappingDatabase.getSRG("field_145761_f");

	/**
	 * <p>
	 * Name: updateLastExecution
	 * </p>
	 */
	public static McObfPair field_193042_c = McMappingDatabase.getSRG("field_193042_c");

}
