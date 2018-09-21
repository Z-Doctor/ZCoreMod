package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackRepository {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceu";
		else
			return "net/minecraft/client/resources/ResourcePackRepository";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceu";
		else
			return "ResourcePackRepository";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceu;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackRepository;";
	}

	/**
	 * <p>
	 * Name: repositoryEntriesAll
	 * </p>
	 */
	public static McObfPair field_110619_e = McMappingDatabase.getSRG("field_110619_e");

	/**
	 * <p>
	 * Name: rprMetadataSerializer
	 * </p>
	 */
	public static McObfPair field_110621_c = McMappingDatabase.getSRG("field_110621_c");

	/**
	 * <p>
	 * Name: dirResourcepacks
	 * </p>
	 */
	public static McObfPair field_110618_d = McMappingDatabase.getSRG("field_110618_d");

	/**
	 * <p>
	 * Name: RESOURCE_PACK_FILTER
	 * </p>
	 */
	public static McObfPair field_110622_a = McMappingDatabase.getSRG("field_110622_a");

	/**
	 * <p>
	 * Name: checkHash
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/io/File;)Z]
	 * </p>
	 */
	public static McObfPair func_190113_a = McMappingDatabase.getSRG("ResourcePackRepository.func_190113_a");

	/**
	 * <p>
	 * Name: validatePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Z]
	 * </p>
	 */
	public static McObfPair func_190112_b = McMappingDatabase.getSRG("ResourcePackRepository.func_190112_b");

	/**
	 * <p>
	 * Name: getResourcePackFiles
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_110614_g = McMappingDatabase.getSRG("ResourcePackRepository.func_110614_g");

	/**
	 * <p>
	 * Name: UNKNOWN_PACK_TEXTURE
	 * </p>
	 */
	public static McObfPair field_191400_f = McMappingDatabase.getSRG("field_191400_f");

	/**
	 * <p>
	 * Name: getDownloadHeaders
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_190115_a = McMappingDatabase.getSRG("ResourcePackRepository.func_190115_a");

	/**
	 * <p>
	 * Name: updateRepositoryEntriesAll
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110611_a = McMappingDatabase.getSRG("ResourcePackRepository.func_110611_a");

	/**
	 * <p>
	 * Name: getDirResourcepacks
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_110612_e = McMappingDatabase.getSRG("ResourcePackRepository.func_110612_e");

	/**
	 * <p>
	 * Name: getResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Lnet/minecraft/client/resources/IResourcePack;]
	 * </p>
	 */
	public static McObfPair func_191399_b = McMappingDatabase.getSRG("ResourcePackRepository.func_191399_b");

	/**
	 * <p>
	 * Name: downloadResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_180601_a = McMappingDatabase.getSRG("ResourcePackRepository.func_180601_a");

	/**
	 * <p>
	 * Name: downloadingPacks
	 * </p>
	 */
	public static McObfPair field_177322_i = McMappingDatabase.getSRG("field_177322_i");

	/**
	 * <p>
	 * Name: getRepositoryEntries
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_110613_c = McMappingDatabase.getSRG("ResourcePackRepository.func_110613_c");

	/**
	 * <p>
	 * Name: getResourcePackEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/ResourcePackRepository$Entry;]
	 * </p>
	 */
	public static McObfPair func_188565_b = McMappingDatabase.getSRG("ResourcePackRepository.func_188565_b");

	/**
	 * <p>
	 * Name: setServerResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_177319_a = McMappingDatabase.getSRG("ResourcePackRepository.func_177319_a");

	/**
	 * <p>
	 * Name: clearResourcePack
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148529_f = McMappingDatabase.getSRG("ResourcePackRepository.func_148529_f");

	/**
	 * <p>
	 * Name: fixDirResourcepacks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110616_f = McMappingDatabase.getSRG("ResourcePackRepository.func_110616_f");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_177320_c = McMappingDatabase.getSRG("field_177320_c");

	/**
	 * <p>
	 * Name: rprDefaultResourcePack
	 * </p>
	 */
	public static McObfPair field_110620_b = McMappingDatabase.getSRG("field_110620_b");

	/**
	 * <p>
	 * Name: deleteOldServerResourcesPacks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_183028_i = McMappingDatabase.getSRG("ResourcePackRepository.func_183028_i");

	/**
	 * <p>
	 * Name: repositoryEntries
	 * </p>
	 */
	public static McObfPair field_110617_f = McMappingDatabase.getSRG("field_110617_f");

	/**
	 * <p>
	 * Name: setRepositories
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_148527_a = McMappingDatabase.getSRG("ResourcePackRepository.func_148527_a");

	/**
	 * <p>
	 * Name: serverResourcePack
	 * </p>
	 */
	public static McObfPair field_148532_f = McMappingDatabase.getSRG("field_148532_f");

	/**
	 * <p>
	 * Name: lock
	 * </p>
	 */
	public static McObfPair field_177321_h = McMappingDatabase.getSRG("field_177321_h");

	/**
	 * <p>
	 * Name: getServerResourcePack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/IResourcePack;]
	 * </p>
	 */
	public static McObfPair func_148530_e = McMappingDatabase.getSRG("ResourcePackRepository.func_148530_e");

	/**
	 * <p>
	 * Name: dirServerResourcepacks
	 * </p>
	 */
	public static McObfPair field_148534_e = McMappingDatabase.getSRG("field_148534_e");

	/**
	 * <p>
	 * Name: getRepositoryEntriesAll
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_110609_b = McMappingDatabase.getSRG("ResourcePackRepository.func_110609_b");

	/**
	 * <p>
	 * Name: SHA1
	 * </p>
	 */
	public static McObfPair field_190117_e = McMappingDatabase.getSRG("field_190117_e");

}
