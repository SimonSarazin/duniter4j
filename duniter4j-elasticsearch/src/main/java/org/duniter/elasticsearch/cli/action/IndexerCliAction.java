package org.duniter.elasticsearch.cli.action;

/*
 * #%L
 * SIH-Adagio :: Shared
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2014 Ifremer
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndexerCliAction {
	/* Logger */
	private static final Logger log = LoggerFactory.getLogger(IndexerCliAction.class);

    /*
    public void indexBlocksFromNode() {

        final boolean async = ServiceLocator.instance().getElasticSearchService().isNodeInstance();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                PluginSettings config = PluginSettings.instance();
                final Peer peer = checkConfigAndGetPeer(config);
                final BlockchainService blockIndexerService = ServiceLocator.instance().getBlockIndexerService();

                // Will create the blockchain if not exist
                blockIndexerService.indexLastBlocks(peer);

                if (async) {
                    ServiceLocator.instance().getBlockchainRemoteService().addNewBlockListener(peer, new WebsocketClientEndpoint.MessageHandler() {
                        @Override
                        public void handleMessage(String message) {
                            String currencyName = GsonUtils.getValueFromJSONAsString(message, "blockchain");
                            *///blockIndexerService.indexLastBlockFromJson(peer, message, true /*refresh*/, true /*wait*/);
                            //blockIndexerService.indexCurrentBlockAsJson(currencyName, message, true /*wait*/);
               /*         }
                    });
                }
            }
        };

        // Async execution
        if (async) {
            ServiceLocator.instance().getExecutorService().execute(runnable);
        }

        // Synchrone execution
        else {
            runnable.run();
        }
    }

    public void resetAllData() {
        resetAllCurrencies();
        resetDataBlocks();
        resetMarketRecords();
        resetRegistry();
    }

    public void resetAllCurrencies() {
        CurrencyRegistryService currencyIndexerService = ServiceLocator.instance().getRegistryCurrencyIndexerService();
        currencyIndexerService.deleteAllCurrencies();
    }

    public void resetDataBlocks() {
        BlockchainRemoteService blockchainService = ServiceLocator.instance().getBlockchainRemoteService();
        BlockchainService indexerService = ServiceLocator.instance().getBlockIndexerService();
        PluginSettings config = PluginSettings.instance();
        Peer peer = checkConfigAndGetPeer(config);

        try {
            // Get the blockchain name from node
            BlockchainParameters parameter = blockchainService.getParameters(peer);
            if (parameter == null) {
                log.error(String.format("Could not connect to node [%s:%s]",
                        config.getNodeBmaHost(), config.getNodeBmaPort()));
                return;
            }
            String currencyName = parameter.getCurrency();

            log.info(String.format("Reset data for index [%s]", currencyName));

            // Delete then create index on blockchain
            boolean indexExists = indexerService.existsIndex(currencyName);
            if (indexExists) {
                indexerService.deleteIndex(currencyName);
                indexerService.createIndex(currencyName);
            }


            log.info(String.format("Successfully reset data for index [%s]", currencyName));
        } catch(Exception e) {
            log.error("Error during reset data: " + e.getMessage(), e);
        }
    }

    public void resetMarketRecords() {
        RecordMarketService recordIndexerService = ServiceLocator.instance().getMarketRecordIndexerService();
        CategoryMarketService categoryIndexerService = ServiceLocator.instance().getMarketCategoryIndexerService();

        try {
            // Delete then create index on records
            boolean indexExists = recordIndexerService.existsIndex();
            if (indexExists) {
                recordIndexerService.deleteIndex();
            }
            log.info(String.format("Successfully reset market records"));

            categoryIndexerService.createIndex();
            categoryIndexerService.initCategories();
            log.info(String.format("Successfully re-initialized market categories data"));

        } catch(Exception e) {
            log.error("Error during reset market records: " + e.getMessage(), e);
        }
    }

    public void resetRegistry() {
        RecordRegistryService recordIndexerService = ServiceLocator.instance().getRegistryRecordIndexerService();
        CategoryRegistryService categoryIndexerService = ServiceLocator.instance().getRegistryCategoryIndexerService();
        CitiesRegistryService citiesIndexerService = ServiceLocator.instance().getRegistryCitiesIndexerService();

        try {
            // Delete then create index on records
            if (recordIndexerService.existsIndex()) {
                recordIndexerService.deleteIndex();
            }
            recordIndexerService.createIndex();
            log.info(String.format("Successfully reset registry records"));


            if (categoryIndexerService.existsIndex()) {
                categoryIndexerService.deleteIndex();
            }
            categoryIndexerService.createIndex();
            categoryIndexerService.initCategories();
            log.info(String.format("Successfully re-initialized registry categories"));

            if (citiesIndexerService.existsIndex()) {
                citiesIndexerService.deleteIndex();
            }
            citiesIndexerService.initCities();
            log.info(String.format("Successfully re-initialized registry cities"));

        } catch(Exception e) {
            log.error("Error during reset registry records: " + e.getMessage(), e);
        }
    }*/

    /* -- internal methods -- */

    /*protected Peer checkConfigAndGetPeer(PluginSettings config) {
        if (StringUtils.isBlank(config.getNodeBmaHost())) {
            log.error("ERROR: node host is required");
            System.exit(-1);
            return null;
        }
        if (config.getNodeBmaPort() <= 0) {
            log.error("ERROR: node port is required");
            System.exit(-1);
            return null;
        }

        Peer peer = new Peer(config.getNodeBmaHost(), config.getNodeBmaPort());
        return peer;
    }*/
}
