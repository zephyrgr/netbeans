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

class RemoveOverrideAnonymousClass1 {

    public function test(): void {
        $anon1 = new class() implements Interface2 {

            #[Override]
            public function interfaceMethod1(): void { // no hints
            }

            #[\Override]
            public function anonymousMethod1(): void { // hints
                $anon2 = new class() implements Interface2 {

                    #[Override]
                    public function interfaceMethod1(): void { // no hints
                    }

                    #[Attr1]
                    #[Override]
                    public function interfaceMethod2(): void { // hints
                    }

                    #[Override]
                    public function interfaceMethod3(): void { // no hints
                    }

                    #[Override]
                    public function interfaceStaticMethod1(): void { // hints
                    }

                    #[Override]
                    public function interfaceStaticMethod2(): void { // no hints
                    }

                    #[Override]
                    public function interfaceStaticMethod3(): void { // no hints
                    }
                };
            }

            #[Override]
            public function interfaceMethod3(): void { // no hints
            }

            #[Override]
            public function interfaceStaticMethod1(): void { // no hints
            }

            #[Override]
            public function interfaceStaticMethod2(): void { // no hints
            }

            #[Override]
            public function interfaceStaticMethod3(): void { // no hints
            }
        };
    }
}
