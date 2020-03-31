/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of GATT attributes.
 */
public class BlueTanistGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    // The service UUID advertised by BlueTanist nodes. Used for filtering.
    public static String NODE_ADVERTISEMENT_UUID = "00000000-0000-0000-0000-420690000000";
    public static String NODE_ADVERTISEMENT_MASK = "00000000-0000-0000-0000-111110000000";
    public static String NODE_SENSOR_DATA = "22222222-0000-0000-0000-222222222222";
//    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        attributes.put(NODE_SENSOR_DATA, "Sensor Data");
        attributes.put("22222222-0000-0000-0000-000000000001", "Temperature");
        attributes.put("22222222-0000-0000-0000-000000000002", "Humidity");
        attributes.put("22222222-0000-0000-0000-000000000003", "Water");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
