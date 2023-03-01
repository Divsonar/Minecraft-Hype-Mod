package net.holden.streetwearmod.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.holden.streetwearmod.StreetwearMod;
import net.holden.streetwearmod.item.ModItems;
import net.holden.streetwearmod.villager.ModVillagers;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = StreetwearMod.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if(event.getType() == ModVillagers.HYPE_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack villageritem = new ItemStack(ModItems.HYPE_FRAGMENT.get(), 15);
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),villageritem,10,1,0.05F));
        }

        if(event.getType() == ModVillagers.HYPE_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack villageritem = new ItemStack(ModItems.HYPE_ESSENCE.get(), 1);
            int villagerLevel = 2;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ModItems.HYPE_FRAGMENT.get(), 16), villageritem, 10, 1, 0.05F));
        }

        if(event.getType() == ModVillagers.HYPE_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack villageritem = new ItemStack(ModItems.SORAYAMA_INGOT.get(), 3);
            int villagerLevel = 2;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(ModItems.HYPE_ESSENCE.get(), 9), new ItemStack(Items.NETHERITE_INGOT, 3), villageritem, 10, 2, 0.05F));
        }

        if(event.getType() == ModVillagers.HYPE_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack villageritem = new ItemStack(ModItems.HYPE_ESSENCE.get(), 1);
            int villagerLevel = 1;
            trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 2), new ItemStack(Items.EMERALD, 1), villageritem, 10, 2, 0.05F));
        }
    }
}
