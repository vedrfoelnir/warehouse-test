package de.pokemon.warehouse;

import de.pokemon.warehouse.core.domain.model.Product;
import de.pokemon.warehouse.core.domain.service.interfaces.IProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@EntityScan(basePackageClasses = {de.pokemon.warehouse.core.domain.model.Product.class})
@ComponentScan(basePackages = {"de.pokemon.warehouse.core.domain"})
@SpringBootApplication
public class WarehouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(IProductService productService) {
		return args -> {
			productService.save(new Product(UUID.randomUUID(), "Phenylpiracetam", 12.9, 500.0, "L-Phenylalanin ist eine wichtige Aminosäure, die im menschlichen Körper für verschiedene Funktionen verantwortlich ist. Es ist ein natürlich vorkommendes Molekül, das in vielen Proteinen enthalten ist und für die Bildung anderer Aminosäuren und Neurotransmitter wie Dopamin und Noradrenalin benötigt wird. L-Phenylalanin kann zur Stimmungsverbesserung beitragen und Schmerzen lindern.", 100));
			productService.save(new Product(UUID.randomUUID(), "Phenylpiracetam", 7.9, 250.0, "L-Phenylalanin ist eine wichtige Aminosäure, die im menschlichen Körper für verschiedene Funktionen verantwortlich ist. Es ist ein natürlich vorkommendes Molekül, das in vielen Proteinen enthalten ist und für die Bildung anderer Aminosäuren und Neurotransmitter wie Dopamin und Noradrenalin benötigt wird. L-Phenylalanin kann zur Stimmungsverbesserung beitragen und Schmerzen lindern.", 100));

			productService.save(new Product(UUID.randomUUID(), "Aniracetam", 16.9, 300.0, "Aniracetam ist ein leistungsstarkes Nootropikum, das entwickelt wurde, um die geistigen Fähigkeiten zu verbessern. Es ist ein schnell wirkendes Ampakin, das die Durchblutung im Gehirn erhöht und die Aktivität von Neurotransmittern wie Acetylcholin und Serotonin beeinflusst. Dies kann zu verbesserten Konzentrationsfähigkeiten, einem stärkeren Gedächtnis und einer erhöhten Lernfähigkeit führen.", 250));
			productService.save(new Product(UUID.randomUUID(), "Aniracetam", 10.9, 150.0, "Aniracetam ist ein leistungsstarkes Nootropikum, das entwickelt wurde, um die geistigen Fähigkeiten zu verbessern. Es ist ein schnell wirkendes Ampakin, das die Durchblutung im Gehirn erhöht und die Aktivität von Neurotransmittern wie Acetylcholin und Serotonin beeinflusst. Dies kann zu verbesserten Konzentrationsfähigkeiten, einem stärkeren Gedächtnis und einer erhöhten Lernfähigkeit führen.", 150));

			productService.save(new Product(UUID.randomUUID(), "Oxiracetam", 829.9, 0.05, "Oxiracetam ist ein nootropisches Medikament, das zur Verbesserung der kognitiven Funktionen wie Gedächtnis und Lernfähigkeit eingesetzt wird. Es gehört zur Gruppe der racetam-Nootropika und wirkt, indem es die Durchblutung im Gehirn verbessert und die Kommunikation zwischen den Neuronen erhöht. Oxiracetam wird oft von Menschen genommen, die ihre kognitive Leistungsfähigkeit verbessern möchten, beispielsweise bei der Arbeit oder beim Lernen.", 5));
			productService.save(new Product(UUID.randomUUID(), "Oxiracetam", 239.9, 0.01, "Oxiracetam ist ein nootropisches Medikament, das zur Verbesserung der kognitiven Funktionen wie Gedächtnis und Lernfähigkeit eingesetzt wird. Es gehört zur Gruppe der racetam-Nootropika und wirkt, indem es die Durchblutung im Gehirn verbessert und die Kommunikation zwischen den Neuronen erhöht. Oxiracetam wird oft von Menschen genommen, die ihre kognitive Leistungsfähigkeit verbessern möchten, beispielsweise bei der Arbeit oder beim Lernen.", 10));

			productService.save(new Product(UUID.randomUUID(), "Pramiracetam", 470.0, 0.2, "Pramiracetam ist ein nootropisches Medikament, das zur Verbesserung der geistigen Leistungsfähigkeit beitragen kann. Es wird häufig von Menschen eingenommen, die ihre kognitiven Fähigkeiten verbessern möchten, wie zum Beispiel Gedächtnis, Konzentration und Lernfähigkeit. Pramiracetam wurde in den 1970er Jahren entwickelt und gehört zur Klasse der Racetam-Verbindungen. Im Gegensatz zu anderen nootropen Medikamenten hat Pramiracetam eine stärkere Wirkung auf die Hirnfunktionen und wird daher oft als eine der mächtigsten nootropen Verbindungen angesehen.", 5));
			productService.save(new Product(UUID.randomUUID(), "Pramiracetam", 170.0, 0.05, "Pramiracetam ist ein nootropisches Medikament, das zur Verbesserung der geistigen Leistungsfähigkeit beitragen kann. Es wird häufig von Menschen eingenommen, die ihre kognitiven Fähigkeiten verbessern möchten, wie zum Beispiel Gedächtnis, Konzentration und Lernfähigkeit. Pramiracetam wurde in den 1970er Jahren entwickelt und gehört zur Klasse der Racetam-Verbindungen. Im Gegensatz zu anderen nootropen Medikamenten hat Pramiracetam eine stärkere Wirkung auf die Hirnfunktionen und wird daher oft als eine der mächtigsten nootropen Verbindungen angesehen.", 5));

			productService.save(new Product(UUID.randomUUID(), "Fasoracetam", 990.9, 0.05, "Fasoracetam ist ein nootropisches Medikament, das entwickelt wurde, um die kognitiven Funktionen zu verbessern und die Gedächtnisleistung zu erhöhen. Es wird hauptsächlich zur Behandlung von ADHS und Angststörungen eingesetzt und wird oft als mögliche Alternative zu anderen, stärker wirkenden Medikamenten wie Ritalin betrachtet.", 20));
			productService.save(new Product(UUID.randomUUID(), "Fasoracetam", 300.0, 0.01, "Fasoracetam ist ein nootropisches Medikament, das entwickelt wurde, um die kognitiven Funktionen zu verbessern und die Gedächtnisleistung zu erhöhen. Es wird hauptsächlich zur Behandlung von ADHS und Angststörungen eingesetzt und wird oft als mögliche Alternative zu anderen, stärker wirkenden Medikamenten wie Ritalin betrachtet.", 25));

			productService.save(new Product(UUID.randomUUID(), "Sunifiram", 700.0, 0.5, "Sunifiram ist ein nootropisches Mittel, das als Potenzierungsmittel für die Gedächtnisleistung und die Konzentration eingesetzt wird. Es gehört zu der Familie der Ampakine-Verbindungen und wirkt, indem es die Signalübertragung zwischen den Nervenzellen im Gehirn verbessert. Sunifiram wird häufig von Menschen eingenommen, die ihre geistigen Fähigkeiten verbessern möchten, wie zum Beispiel beim Lernen oder bei kognitiven Aufgaben. ", 10));
			productService.save(new Product(UUID.randomUUID(), "Sunifiram", 150.0, 0.1, "Sunifiram ist ein nootropisches Mittel, das als Potenzierungsmittel für die Gedächtnisleistung und die Konzentration eingesetzt wird. Es gehört zu der Familie der Ampakine-Verbindungen und wirkt, indem es die Signalübertragung zwischen den Nervenzellen im Gehirn verbessert. Sunifiram wird häufig von Menschen eingenommen, die ihre geistigen Fähigkeiten verbessern möchten, wie zum Beispiel beim Lernen oder bei kognitiven Aufgaben. ", 10));

			productService.save(new Product(UUID.randomUUID(), "Noopept", 60.0, 1.2, "Noopept ist ein starkes kognitives Verbesserungsmittel, das hilft, die Gedächtnisleistung und das Lernvermögen zu verbessern. Es wird oft als Alternative zu klassischen Nootropika wie Piracetam oder Aniracetam eingesetzt und gilt als etwa 1000-mal stärker als Piracetam. Noopept wird auch als Neuroprotectant betrachtet und kann helfen, die neuronale Gesundheit im Gehirn zu erhalten und zu verbessern.", 15));
			productService.save(new Product(UUID.randomUUID(), "Noopept", 30.0, 0.5, "Noopept ist ein starkes kognitives Verbesserungsmittel, das hilft, die Gedächtnisleistung und das Lernvermögen zu verbessern. Es wird oft als Alternative zu klassischen Nootropika wie Piracetam oder Aniracetam eingesetzt und gilt als etwa 1000-mal stärker als Piracetam. Noopept wird auch als Neuroprotectant betrachtet und kann helfen, die neuronale Gesundheit im Gehirn zu erhalten und zu verbessern.", 15));

			productService.save(new Product(UUID.randomUUID(), "Adrafinil", 170.0, 1.0, "Adrafinil ist ein verschreibungspflichtiges Medikament, das zur Verbesserung der geistigen Leistungsfähigkeit eingesetzt wird. Es wird häufig von Menschen genommen, die unter Narkolepsie leiden, einer schlafbezogenen Störung, die zu plötzlichen Einschlafattacken führen kann. Adrafinil kann auch zur Verbesserung des Gedächtnisses und der Konzentration eingesetzt werden und wird manchmal von Menschen genommen, die unter Müdigkeit oder Erschöpfung leiden.", 20));
			productService.save(new Product(UUID.randomUUID(), "Adrafinil", 95.0, 0.5, "Adrafinil ist ein verschreibungspflichtiges Medikament, das zur Verbesserung der geistigen Leistungsfähigkeit eingesetzt wird. Es wird häufig von Menschen genommen, die unter Narkolepsie leiden, einer schlafbezogenen Störung, die zu plötzlichen Einschlafattacken führen kann. Adrafinil kann auch zur Verbesserung des Gedächtnisses und der Konzentration eingesetzt werden und wird manchmal von Menschen genommen, die unter Müdigkeit oder Erschöpfung leiden.", 20));

			productService.save(new Product(UUID.randomUUID(), "Modafinil", 59.9, 300.0,"Modafinil ist ein Medikament, das zur Behandlung von Schlafstörungen wie Narkolepsie und zur Verbesserung der Wachsamkeit bei Erwachsenen eingesetzt wird. Es ist ein sogenanntes eugeroisches Mittel, das die Wachsamkeit fördert und Müdigkeit verringert. Modafinil wird normalerweise in Tablettenform eingenommen und kann helfen, die kognitive Leistungsfähigkeit zu verbessern und die Konzentration zu steigern.", 30));
			productService.save(new Product(UUID.randomUUID(), "Modafinil", 30.9, 120.0,"Modafinil ist ein Medikament, das zur Behandlung von Schlafstörungen wie Narkolepsie und zur Verbesserung der Wachsamkeit bei Erwachsenen eingesetzt wird. Es ist ein sogenanntes eugeroisches Mittel, das die Wachsamkeit fördert und Müdigkeit verringert. Modafinil wird normalerweise in Tablettenform eingenommen und kann helfen, die kognitive Leistungsfähigkeit zu verbessern und die Konzentration zu steigern.", 30));

			productService.save(new Product(UUID.randomUUID(), "Phenibut", 79.9, 200.0, "Phenibut ist ein psychotropes Medikament, das hauptsächlich zur Behandlung von Angstzuständen und Schlafstörungen eingesetzt wird. Es wird manchmal auch zur Bekämpfung von Depressionen und zur Verbesserung der kognitiven Funktionen eingesetzt.", 20));
			productService.save(new Product(UUID.randomUUID(), "Phenibut", 30.9, 70.0, "Phenibut ist ein psychotropes Medikament, das hauptsächlich zur Behandlung von Angstzuständen und Schlafstörungen eingesetzt wird. Es wird manchmal auch zur Bekämpfung von Depressionen und zur Verbesserung der kognitiven Funktionen eingesetzt.", 15));

			productService.save(new Product(UUID.randomUUID(), "Sulbutiamine", 50.0, 20.0, "Sulbutiamine ist ein synthetischer Derivat von Vitamin B1 (Thiamin). Es wird als Nahrungsergänzungsmittel vermarktet und wird häufig als mögliche Behandlung für Gedächtnis- und Konzentrationsprobleme sowie Müdigkeit und Erschöpfung eingesetzt.", 20));
			productService.save(new Product(UUID.randomUUID(), "Sulbutiamine", 25.0, 8.0, "Sulbutiamine ist ein synthetischer Derivat von Vitamin B1 (Thiamin). Es wird als Nahrungsergänzungsmittel vermarktet und wird häufig als mögliche Behandlung für Gedächtnis- und Konzentrationsprobleme sowie Müdigkeit und Erschöpfung eingesetzt.", 20));

			productService.save(new Product(UUID.randomUUID(), "Alpha-GPC", 24.9, 30.0, "Alpha-GPC ist ein natürlicher Wirkstoff, der im menschlichen Körper vorkommt und als Nootropikum eingesetzt wird. Es wird oft als Nahrungsergänzungsmittel verkauft und soll die kognitive Leistungsfähigkeit verbessern, indem es die Produktion von Acetylcholin im Gehirn erhöht.", 30));
			productService.save(new Product(UUID.randomUUID(), "Alpha-GPC", 10.9, 10.0, "Alpha-GPC ist ein natürlicher Wirkstoff, der im menschlichen Körper vorkommt und als Nootropikum eingesetzt wird. Es wird oft als Nahrungsergänzungsmittel verkauft und soll die kognitive Leistungsfähigkeit verbessern, indem es die Produktion von Acetylcholin im Gehirn erhöht.", 30));
		};
	}

}