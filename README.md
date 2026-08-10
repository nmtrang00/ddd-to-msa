# DACT — Domain and ACTivity

A graphical DSL for modelling Domain-Driven Design (DDD) concepts together with the behaviour of
their operations, and a model-driven transformation chain that generates functional Java
microservice code from those models.

This repository accompanies the thesis *Incorporating Behavioral Specification into Domain Modeling* and contains the proof-of-concept implementation: the DACT metamodel and editor, the adapted LEMMA metamodels used as an intermediate representation, the transformation implementation, and the validation examples.

## Repository structure

| Directory | Contents |
|---|---|
| `dact.metamodel` | The DACT metamodel, defined in Xcore, covering both the domain and the activity sub-languages |
| `dact.design` | Sirius design specification providing the graphical editors for the DDD and activity viewpoints |
| `lemma.adapted.data.metamodel` | LEMMA data metamodel, adapted with the complex type reclassification |
| `lemma.adapted.service.metamodel` | LEMMA service metamodel, adapted with the interface and operation type classifications |
| `lemma.adapted.technology.metamodel` | LEMMA technology metamodel, adapted for the generation targets |
| `lemma.adapted.behavior.metamodel` | The behaviour metamodel introduced in this work, which LEMMA does not natively provide |
| `initProjects.sh` | Script to initialize Java Spring Boot project |
| `validation` | Example models used to exercise the transformation, including the Cargo case study |

## Prerequisites

- Eclipse Modeling Tools ([version])
- Xtext and Xcore ([version])
- Sirius ([version])
- QVT Operational ([version])
- Acceleo ([version])
- Java [version] and Maven [version] for building the generated services

## Getting started

1. Import all projects into an Eclipse workspace (*File → Import → Existing Projects into
   Workspace*).
2. Generate the model code for each metamodel project by opening its `.xcore` file and saving it,
   which triggers the EMF generator.
3. Launch a runtime Eclipse instance (*Run → Run Configurations → Eclipse Application*). The DACT
   editors are available in this instance.

## Running the transformation

1. Open a DACT model from `validation` in the runtime instance, or create a new one through the
   Sirius editor.
2. Run the QVTo transformation to produce the LEMMA data, service, and behaviour models
   (*[launch configuration name]*). This covers preprocessing and the mapping to LEMMA.
3. Run the Acceleo generation on the resulting behaviour model to produce the Java sources. The
   service and data models are resolved automatically through the shared resource set, so only the
   behaviour model is passed as input.
4. Initialise a Spring Boot project for each generated microservice with the dependencies listed in
   [reference], and copy the generated sources into it. Project scaffolding is not produced by the
   transformation.

## Example

The Cargo case study in `validation` is the running example used throughout the thesis. It models
[n] bounded contexts and [n] activities, and generates [n] microservices.

## Current scope

The implementation is a proof of concept and does not cover the full transformation described in
the thesis. In particular:

- only synchronous inter-service communication is generated; the asynchronous path is specified but
  not implemented;
- message handler templates are not implemented;
- shared domain object localisation covers shared value objects but not domain events;
- the generated service layer is not separated into domain and application services.

## License

[license]
