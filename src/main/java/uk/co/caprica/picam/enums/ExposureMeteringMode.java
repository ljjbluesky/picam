/*
 * This file is part of picam.
 *
 * picam is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * picam is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with picam.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2016 Caprica Software Limited.
 */

package uk.co.caprica.picam.enums;

public enum ExposureMeteringMode {

    AVERAGE(0),
    SPOT(1),
    BACKLIT(2),
    MATRIX(3),
    MAX(0x7fffffff);

    private final int value;

    ExposureMeteringMode(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
