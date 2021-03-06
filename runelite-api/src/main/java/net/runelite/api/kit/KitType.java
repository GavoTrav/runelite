/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api.kit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.widgets.WidgetInfo;

/**
 * Represents an equipment slot in a players composition.
 * <p>
 * These values are intended for use with {PlayerAppearance} equipment
 * slots. For obtaining information about equipment in the local players
 * equipment {net.runelite.api.ItemContainer}, use
 * {net.runelite.api.EquipmentInventorySlot}.
 */
@Getter
@AllArgsConstructor
public enum KitType
{
	HELMET("Helmet", 0, WidgetInfo.EQUIPMENT_HELMET),
	CAPE("Cape", 1, WidgetInfo.EQUIPMENT_CAPE),
	AMULET("Amulet", 2, WidgetInfo.EQUIPMENT_AMULET),
	WEAPON("Weapon", 3, WidgetInfo.EQUIPMENT_WEAPON),
	TORSO("Torso", 4, WidgetInfo.EQUIPMENT_BODY),
	SHIELD("Shield", 5, WidgetInfo.EQUIPMENT_SHIELD),
	LEGS("Legs", 7, WidgetInfo.EQUIPMENT_LEGS),
	HEAD("Head", 8, null),
	HANDS("Hands", 9, WidgetInfo.EQUIPMENT_GLOVES),
	BOOTS("Boots", 10, WidgetInfo.EQUIPMENT_BOOTS),
	JAW("Jaw", 11, null),
	RING("Ring", 12, WidgetInfo.EQUIPMENT_RING),
	AMMUNITION("Ammo", 13, WidgetInfo.EQUIPMENT_AMMO);

	private final String name;

	/**
	 * Gets the raw equipment index for use in {PlayerAppearance#getEquipmentIds()}.
	 */
	private final int index;

	private final WidgetInfo widgetInfo;
}