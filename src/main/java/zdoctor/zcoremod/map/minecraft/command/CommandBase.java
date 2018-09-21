package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bi";
		else
			return "net/minecraft/command/CommandBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bi";
		else
			return "CommandBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbi;";
		else
			return "Lnet/minecraft/command/CommandBase;";
	}

	/**
	 * <p>
	 * Name: isUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_82358_a = McMappingDatabase.getSRG("CommandBase.func_82358_a");

	/**
	 * <p>
	 * Name: convertArgToBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Ljava/lang/String;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_190794_a = McMappingDatabase.getSRG("CommandBase.func_190794_a");

	/**
	 * <p>
	 * Name: checkPermission
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;)Z]
	 * </p>
	 */
	public static McObfPair func_184882_a = McMappingDatabase.getSRG("CommandBase.func_184882_a");

	/**
	 * <p>
	 * Name: parseCoordinate
	 * </p>
	 * <p>
	 * Desc: [(DLjava/lang/String;Z)Lnet/minecraft/command/CommandBase$CoordinateArg;]
	 * </p>
	 */
	public static McObfPair func_175770_a = McMappingDatabase.getSRG("CommandBase.func_175770_a");

	/**
	 * <p>
	 * Name: getPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/entity/player/EntityPlayerMP;Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_193512_a = McMappingDatabase.getSRG("CommandBase.func_193512_a");

	/**
	 * <p>
	 * Name: parseDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;D)D]
	 * </p>
	 */
	public static McObfPair func_180526_a = McMappingDatabase.getSRG("CommandBase.func_180526_a");

	/**
	 * <p>
	 * Name: setCommandListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandListener;)V]
	 * </p>
	 */
	public static McObfPair func_71529_a = McMappingDatabase.getSRG("CommandBase.func_71529_a");

	/**
	 * <p>
	 * Name: getEntityList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184890_c = McMappingDatabase.getSRG("CommandBase.func_184890_c");

	/**
	 * <p>
	 * Name: getEntityName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184891_e = McMappingDatabase.getSRG("CommandBase.func_184891_e");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184885_b = McMappingDatabase.getSRG("CommandBase.func_184885_b");

	/**
	 * <p>
	 * Name: parseCoordinate
	 * </p>
	 * <p>
	 * Desc: [(DLjava/lang/String;IIZ)Lnet/minecraft/command/CommandBase$CoordinateArg;]
	 * </p>
	 */
	public static McObfPair func_175767_a = McMappingDatabase.getSRG("CommandBase.func_175767_a");

	/**
	 * <p>
	 * Name: getPlayerName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184886_d = McMappingDatabase.getSRG("CommandBase.func_184886_d");

	/**
	 * <p>
	 * Name: joinNiceString
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/Object;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71527_a = McMappingDatabase.getSRG("CommandBase.func_71527_a");

	/**
	 * <p>
	 * Name: parseBoolean
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_180527_d = McMappingDatabase.getSRG("CommandBase.func_180527_d");

	/**
	 * <p>
	 * Name: parseDouble
	 * </p>
	 * <p>
	 * Desc: [(DLjava/lang/String;IIZ)D]
	 * </p>
	 */
	public static McObfPair func_175769_b = McMappingDatabase.getSRG("CommandBase.func_175769_b");

	/**
	 * <p>
	 * Name: getAliases
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71514_a = McMappingDatabase.getSRG("CommandBase.func_71514_a");

	/**
	 * <p>
	 * Name: buildString
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_180529_a = McMappingDatabase.getSRG("CommandBase.func_180529_a");

	/**
	 * <p>
	 * Name: getPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193513_a = McMappingDatabase.getSRG("CommandBase.func_193513_a");

	/**
	 * <p>
	 * Name: getPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_184888_a = McMappingDatabase.getSRG("CommandBase.func_184888_a");

	/**
	 * <p>
	 * Name: toSyntaxException
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonParseException;)Lnet/minecraft/command/SyntaxErrorException;]
	 * </p>
	 */
	public static McObfPair func_184889_a = McMappingDatabase.getSRG("CommandBase.func_184889_a");

	/**
	 * <p>
	 * Name: parseDouble
	 * </p>
	 * <p>
	 * Desc: [(DLjava/lang/String;Z)D]
	 * </p>
	 */
	public static McObfPair func_175761_b = McMappingDatabase.getSRG("CommandBase.func_175761_b");

	/**
	 * <p>
	 * Name: getChatComponentFromNthArg
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;IZ)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_147176_a = McMappingDatabase.getSRG("CommandBase.func_147176_a");

	/**
	 * <p>
	 * Name: EQUAL_SPLITTER
	 * </p>
	 */
	public static McObfPair field_190797_c = McMappingDatabase.getSRG("field_190797_c");

	/**
	 * <p>
	 * Name: COMMA_SPLITTER
	 * </p>
	 */
	public static McObfPair field_190796_b = McMappingDatabase.getSRG("field_190796_b");

	/**
	 * <p>
	 * Name: getBlockByText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_147180_g = McMappingDatabase.getSRG("CommandBase.func_147180_g");

	/**
	 * <p>
	 * Name: getCommandSenderAsPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Lnet/minecraft/entity/player/EntityPlayerMP;]
	 * </p>
	 */
	public static McObfPair func_71521_c = McMappingDatabase.getSRG("CommandBase.func_71521_c");

	/**
	 * <p>
	 * Name: getEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184884_a = McMappingDatabase.getSRG("CommandBase.func_184884_a");

	/**
	 * <p>
	 * Name: parseBlockPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;IZ)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_175757_a = McMappingDatabase.getSRG("CommandBase.func_175757_a");

	/**
	 * <p>
	 * Name: getListOfStringsMatchingLastWord
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_71530_a = McMappingDatabase.getSRG("CommandBase.func_71530_a");

	/**
	 * <p>
	 * Name: entityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_184887_a = McMappingDatabase.getSRG("CommandBase.func_184887_a");

	/**
	 * <p>
	 * Name: notifyCommandListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;Ljava/lang/String;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152373_a = McMappingDatabase.getSRG("CommandBase.func_152373_a");

	/**
	 * <p>
	 * Name: getTabCompletionCoordinateXZ
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;ILnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_181043_b = McMappingDatabase.getSRG("CommandBase.func_181043_b");

	/**
	 * <p>
	 * Name: getBlockStatePropertyValueMap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Ljava/lang/String;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_190795_c = McMappingDatabase.getSRG("CommandBase.func_190795_c");

	/**
	 * <p>
	 * Name: parseDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;DD)D]
	 * </p>
	 */
	public static McObfPair func_175756_a = McMappingDatabase.getSRG("CommandBase.func_175756_a");

	/**
	 * <p>
	 * Name: getChatComponentFromNthArg
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;I)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_147178_a = McMappingDatabase.getSRG("CommandBase.func_147178_a");

	/**
	 * <p>
	 * Name: getListOfStringsMatchingLastWord
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;Ljava/util/Collection;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175762_a = McMappingDatabase.getSRG("CommandBase.func_175762_a");

	/**
	 * <p>
	 * Name: getTabCompletionCoordinate
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;ILnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175771_a = McMappingDatabase.getSRG("CommandBase.func_175771_a");

	/**
	 * <p>
	 * Name: doesStringStartWith
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_71523_a = McMappingDatabase.getSRG("CommandBase.func_71523_a");

	/**
	 * <p>
	 * Name: parseInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_175755_a = McMappingDatabase.getSRG("CommandBase.func_175755_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandBase.func_184883_a");

	/**
	 * <p>
	 * Name: getItemByText
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_147179_f = McMappingDatabase.getSRG("CommandBase.func_147179_f");

	/**
	 * <p>
	 * Name: joinNiceStringFromCollection
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_96333_a = McMappingDatabase.getSRG("CommandBase.func_96333_a");

	/**
	 * <p>
	 * Name: parseInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)I]
	 * </p>
	 */
	public static McObfPair func_180528_a = McMappingDatabase.getSRG("CommandBase.func_180528_a");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandBase.func_82362_a");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_190793_a = McMappingDatabase.getSRG("CommandBase.func_190793_a");

	/**
	 * <p>
	 * Name: parseInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)I]
	 * </p>
	 */
	public static McObfPair func_175764_a = McMappingDatabase.getSRG("CommandBase.func_175764_a");

	/**
	 * <p>
	 * Name: parseDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)D]
	 * </p>
	 */
	public static McObfPair func_175765_c = McMappingDatabase.getSRG("CommandBase.func_175765_c");

	/**
	 * <p>
	 * Name: join
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_180530_a = McMappingDatabase.getSRG("CommandBase.func_180530_a");

	/**
	 * <p>
	 * Name: parseLong
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;JJ)J]
	 * </p>
	 */
	public static McObfPair func_175760_a = McMappingDatabase.getSRG("CommandBase.func_175760_a");

	/**
	 * <p>
	 * Name: getValueHelper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/String;)Ljava/lang/Comparable;]
	 * </p>
	 */
	public static McObfPair func_190792_a = McMappingDatabase.getSRG("CommandBase.func_190792_a");

	/**
	 * <p>
	 * Name: notifyCommandListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;ILjava/lang/String;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152374_a = McMappingDatabase.getSRG("CommandBase.func_152374_a");

	/**
	 * <p>
	 * Name: convertArgToBlockStatePredicate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Ljava/lang/String;)Lcom/google/common/base/Predicate;]
	 * </p>
	 */
	public static McObfPair func_190791_b = McMappingDatabase.getSRG("CommandBase.func_190791_b");

	/**
	 * <p>
	 * Name: commandListener
	 * </p>
	 */
	public static McObfPair field_71533_a = McMappingDatabase.getSRG("field_71533_a");

	/**
	 * <p>
	 * Name: parseLong
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)J]
	 * </p>
	 */
	public static McObfPair func_175766_b = McMappingDatabase.getSRG("CommandBase.func_175766_b");

}
