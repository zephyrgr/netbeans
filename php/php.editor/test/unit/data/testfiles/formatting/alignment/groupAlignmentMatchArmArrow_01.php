<?php

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

$type1 = "test";
$type2 = 1;
match ($type1) {
    'min' => 'min', 'maxLength' => 'maxLength', default => null,
};

$m = match ($type1) {
     'maxLength' => 'maxLength', 'min' => 'min', default => null,
};

match ($type1) {
    'min' => 'min', 'maxLength' => 'maxLength',
    default => null,
};

match ($type1) {
    'maxLength' => 'maxLength',
    'min' => 'mim',
    default => null,
};
match ($type1) {
    'min' => 'min',
    'maxLength' => 'maxLength',
    default => null,
};

match ($type1) {
    'maxLength', 'min' => 'min',
    'test' => 'test',
    default => null,
};

match ($type1) {
    'maxLength', 'test' => 'maxLength',
    'min' => match ($type2) {
        1, 2 => "nested",
        3 => "nested",
        4 => "nested",
    },
    default => null,
};

match ($type1) {
    'min' => 'min',
    'maxLength' => match ($type2) {
        1 => "nested",
        "maxLength" => "nested", "test" => "test",
        4 => "nested",
    },
    default => null,
};



match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    11111111111 => '11',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    11111111111 => '11',
    122222222222 => '12',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    11111111111 => '11',
    122222222222 => '12',
    1333333333333 => '13',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    11111111111 => '11',
    122222222222 => '12',
    1333333333333 => '13',
    14444444444444 => '14',
    default => null,
};

match ($type1) {
    1 => '1',
    22 => '2',
    333 => '3',
    4444 => '4',
    55555 => '5',
    666666 => '6',
    7777777 => '7',
    88888888 => '8',
    999999999 => '9',
    1000000000 => '10',
    11111111111 => '11',
    122222222222 => '12',
    1333333333333 => '13',
    14444444444444 => '14',
    155555555555555 => '15',
    default => null,
};
