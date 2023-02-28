//package net.holden.streetwearmod.villager;
//
//import com.google.common.collect.ImmutableSet;
//import net.holden.streetwearmod.StreetwearMod;
//import net.minecraft.world.entity.ai.village.poi.PoiType;
//import net.minecraft.world.entity.npc.VillagerProfession;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//import java.lang.reflect.InvocationTargetException;
//
//public class ModVillagers {
//    public static final DeferredRegister<PoiType> POI_TYPES =
//            DeferredRegister.create(ForgeRegistries.POI_TYPES, StreetwearMod.MOD_ID);
//    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
//            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, StreetwearMod.MOD_ID);
//
//    public static void register(IEventBus eventBus) {
//        POI_TYPES.register(eventBus);
//        VILLAGER_PROFESSIONS.register(eventBus);
//    }
//}
