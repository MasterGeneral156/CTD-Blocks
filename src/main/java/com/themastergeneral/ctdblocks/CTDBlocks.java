package com.themastergeneral.ctdblocks;

import com.themastergeneral.ctdblocks.proxy.Common;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CTDBlocks.MODID, name = CTDBlocks.MODNAME, version = CTDBlocks.VERSION, acceptedMinecraftVersions = CTDBlocks.acceptedMinecraftVersions,
updateJSON = CTDBlocks.updateJSON, certificateFingerprint = CTDBlocks.certificateFingerprint, dependencies = CTDBlocks.DEPENDENCIES)
public class CTDBlocks
{
	public static final String MODID = "ctdblocks";
    public static final String MODNAME = "CTD Blocks";
    public static final String VERSION = "0.0.1";
    // Update JSON link
    public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Blocks.json";
    public static final String acceptedMinecraftVersions = "1.12.2";
    // TMG's public key
    public static final String certificateFingerprint = "5101015479fe39f20b47f365472250d312a50a57";
    // Required after CTD Core
    // [https://minecraft.curseforge.com/projects/ctd-core]
    public static final String DEPENDENCIES = "required-after:ctdcore;";
    
    @Instance
    public static CTDBlocks instance = new CTDBlocks();
    
    @SidedProxy(clientSide = "com.themastergeneral.ctdblocks.proxy.Client", serverSide = "com.themastergeneral.ctdblocks.proxy.Server")
    public static Common proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }

    @EventHandler
    public void onFingerprintViolation(FMLFingerprintViolationEvent e)
    {
        FMLLog.warning("Invalid fingerprint detected for CTD Blocks! TheMasterGeneral will not support this version!");
    }

}
