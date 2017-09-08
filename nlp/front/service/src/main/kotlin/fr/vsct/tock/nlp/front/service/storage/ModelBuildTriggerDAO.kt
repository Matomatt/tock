/*
 * Copyright (C) 2017 VSCT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.vsct.tock.nlp.front.service.storage

import fr.vsct.tock.nlp.front.shared.build.ModelBuild
import fr.vsct.tock.nlp.front.shared.build.ModelBuildQueryResult
import fr.vsct.tock.nlp.front.shared.build.ModelBuildTrigger
import java.util.Locale

/**
 *
 */
interface ModelBuildTriggerDAO {

    fun save(trigger: ModelBuildTrigger)

    fun deleteTrigger(trigger: ModelBuildTrigger)

    fun getTriggers(): List<ModelBuildTrigger>

    fun save(build: ModelBuild)

    fun builds(applicationId: String, language: Locale, start: Int, size: Int): ModelBuildQueryResult
}