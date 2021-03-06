/*
 *  Weather API.
 *  Copyright (C) 2012 Denis Nelubin
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package ru.gelin.android.weather;

/**
 *  Holds cloudiness value.
 */
public interface Cloudiness {

    /** Unknown cloudiness value */
    static int UNKNOWN = Integer.MIN_VALUE;
    
    /**
     *  Returns general cloudiness value.
     */
    int getValue();
    
    /**
     *  Cloudiness unit for this instance.
     */
    CloudinessUnit getCloudinessUnit();
    
    /**
     *  Returns cloudiness as a human readable text.
     *  Can return null.
     */
    String getText();
    
}
